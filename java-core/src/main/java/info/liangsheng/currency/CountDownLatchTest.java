package info.liangsheng.currency;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zhong on 8/16/16.
 */
public class CountDownLatchTest {


    public static void main(String[] args) throws InterruptedException{

        CountDownLatch latch = new CountDownLatch(2);


        Thread t = new Thread(){

            @Override
            public void run() {

                System.out.println("1");
                latch.countDown();

                System.out.println("2");
                latch.countDown();
            }
        };

        t.start();
        latch.await();

        System.out.println("3");
    }
}
