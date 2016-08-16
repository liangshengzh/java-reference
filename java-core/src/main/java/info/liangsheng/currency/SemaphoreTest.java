package info.liangsheng.currency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by zhong on 8/16/16.
 */
public class SemaphoreTest {
    private static final int THREAD_COUNT = 30;
    private static ExecutorService pool  = Executors.newFixedThreadPool(THREAD_COUNT);
    private static Semaphore  s= new Semaphore(10);

    public static void main(String[] args) {
        for(int i = 0; i< THREAD_COUNT;i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        s.acquire();
                        System.out.println("save data");
                        Thread.sleep(1000);
                        s.release();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
        pool.shutdown();
    }

}
