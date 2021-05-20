import java.security.SecureRandom;
import java.util.concurrent.Semaphore;

public  class Reader implements Runnable {
    //fields

    private static final SecureRandom generator= new SecureRandom();
    private Data data;


    public Reader(Data data){
        this.data=data;
    }

    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(generator.nextInt(3000));
                System.out.println("x = "+data.getX()+", y= "+data.getY()+", difference: "+data.getDiff());
            }
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "data=" + data +
                '}';
    }
}
