package info.liangsheng.currency;

import java.util.concurrent.locks.Lock;

/**
 * Created by zhong on 8/16/16.
 */
public class TwinsLockTest {
    static  final Lock lock = new TwinsLock();

    public static void main(String[] args) {
        class Worker  extends Thread{
            @Override
            public void run() {
                while (true){
                    lock.lock();
                    try{
                        Thread.sleep(10000);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(10000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            }
        }

        for(int i =0; i< 10;i++){
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }


        for(int j=0;j<10;j++){
            try {
                Thread.sleep(1000);
                System.out.println();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
