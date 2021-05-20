import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.*;

public  class Data {
    private int x=0;
    private int y=0;
    private boolean writerCanWrite=true;
    private boolean readerIsLock;
    private boolean readerCanWrite=true;
    private boolean writerIsWaiting=false;
    Lock Lock;
    Condition Cond;
    int numberOfThreadsReading=0;
    int numberOfThreadsWriting=0;


    public Data(){
        Lock = new ReentrantLock();
        Cond = Lock.newCondition();

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public  int getDiff() throws InterruptedException {
        while(!readerCanWrite){
            readerIsLock=true;
            Lock.lock();
            Cond.await();
        }
        try {
            numberOfThreadsReading++;
            Thread.sleep(1000);
            System.out.println("welcome to getDiff function! "+'\n'+
                    "thread is writing :"+Thread.currentThread().toString() +'\n' +
                    "number of threads are writing is: "+numberOfThreadsWriting +'\n' +
                    "number of threads are reading is: "+numberOfThreadsReading);
            return (Math.abs(x - y));
        } catch (InterruptedException e) { e.printStackTrace();return -1; }
        finally {
            numberOfThreadsReading--;
                if(writerIsWaiting){
                    readerCanWrite=false;
                    if(numberOfThreadsReading==0) {
                        if(readerIsLock==false){
                            readerIsLock=true;
                            Lock.lock();
                        }
                        Cond.signalAll();
                    }
                }
                if(readerCanWrite=true){
                    if(readerIsLock==true){
                        readerIsLock=false;
                        Lock.unlock();
                    }
                }
            }
        }
    public void update (int dx,int dy) throws InterruptedException {
        Lock.lock();
       while (numberOfThreadsReading>0){
           writerIsWaiting=true;
           Cond.await();
       }
        try{
            readerCanWrite=false;
            numberOfThreadsWriting++;
            System.out.println("welcome to update function! "+'\n'+
            "thread is writing :"+Thread.currentThread().toString() +'\n' +
            "number of threads are writing is: "+numberOfThreadsWriting +'\n' +
            "number of threads are reading is: "+numberOfThreadsReading);
            x = x + dx;
            y = y + dy;
        }
        finally {
            numberOfThreadsWriting--;
            writerIsWaiting=false;
            readerCanWrite=true;
            readerIsLock=false;
            Cond.signalAll();
            Lock.unlock();

           }
        }


    }

