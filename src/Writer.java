import java.security.SecureRandom;
import java.util.Random;

public class Writer implements  Runnable{
    private static final SecureRandom generator= new SecureRandom();
    private Data data;

    public Writer(Data data){
        this.data=data;
    }

    public void run(){
        int max=100, min=-100,dx,dy;
        for(int i=0;i<10;i++){
            try{
                Random rand =new Random();
               dx=rand.nextInt(max - min) + min;
               dy=rand.nextInt(max - min) + min;
                Thread.sleep(generator.nextInt(3000));
                this.data.update(dx,dy);

            }
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }

    @Override
    public String toString() {
        return "Writer{" +
                "data=" + data +
                '}';
    }
}
