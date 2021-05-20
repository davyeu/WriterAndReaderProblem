/**
 * David BM 302518097
 *
 * The Writer and reader problem
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Main {
    public static void main(String []args ){
        Data myData=new Data();
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new Writer(myData));
        executor.execute(new Writer(myData));
        executor.execute(new Writer(myData));
        executor.execute(new Writer(myData));
        executor.execute(new Reader(myData));
        executor.execute(new Reader(myData));
        executor.execute(new Reader(myData));
        executor.execute(new Reader(myData));
        executor.shutdown();
    }
}
/**
 *
 * EXAMPLE OF OUTPUT
 *
 * C:\Users\User\.jdks\openjdk-14.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\lib\idea_rt.jar=61197:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\myFiles\java\MMANIM\MAMAN15\Q2\out\production\MAMAN15-Q2 Main
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = 157, y= -59, difference: 216
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = 157, y= -59, difference: 216
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -51, y= 76, difference: 127
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -51, y= 76, difference: 127
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = 48, y= 365, difference: 317
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = 48, y= 365, difference: 317
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = 48, y= 365, difference: 317
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -175, y= 406, difference: 581
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -175, y= 406, difference: 581
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -210, y= 320, difference: 530
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -210, y= 320, difference: 530
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -210, y= 320, difference: 530
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -37, y= 130, difference: 167
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -37, y= 130, difference: 167
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 4
 * x = -176, y= 265, difference: 441
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -176, y= 265, difference: 441
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 4
 * x = -176, y= 265, difference: 441
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -176, y= 265, difference: 441
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -176, y= 265, difference: 441
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -176, y= 265, difference: 441
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = 13, y= 378, difference: 365
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = 13, y= 378, difference: 365
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -27, y= 456, difference: 483
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-4,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -27, y= 274, difference: 301
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -27, y= 274, difference: 301
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -27, y= 274, difference: 301
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 4
 * x = -92, y= 155, difference: 247
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-5,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 3
 * x = -92, y= 155, difference: 247
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -92, y= 155, difference: 247
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -92, y= 155, difference: 247
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-2,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-1,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -41, y= 129, difference: 170
 * welcome to update function!
 * thread is writing :Thread[pool-1-thread-3,5,main]
 * number of threads are writing is: 1
 * number of threads are reading is: 0
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-7,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 2
 * x = -38, y= 219, difference: 257
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-8,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -38, y= 219, difference: 257
 * welcome to getDiff function!
 * thread is writing :Thread[pool-1-thread-6,5,main]
 * number of threads are writing is: 0
 * number of threads are reading is: 1
 * x = -38, y= 219, difference: 257
 *
 * Process finished with exit code 0
 */