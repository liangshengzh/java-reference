package info.liangsheng.thread.lock;

import java.util.concurrent.locks.Lock;

/**
 * Created by zhong on 3/20/16.
 */
public class Consumer implements Runnable {
    private Lock lock;
    public Consumer(Lock lock) {
        this.lock = lock;
    }
    int count = 10;
    public void run() {
        while (count > 0){
            try{
                lock.lock();
                count--;
                System.out.println("A");
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
        }
    }
}
