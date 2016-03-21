package info.liangsheng.thread.sync;

/**
 * Created by zhong on 3/20/16.
 */
public class Producer implements  Runnable{

    int count = 10;

    public synchronized void run() {
        while (count > 0){
            synchronized(Test.obj){
                System.out.println("A");
                Test.obj.notify();

                try {
                    Test.obj.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
