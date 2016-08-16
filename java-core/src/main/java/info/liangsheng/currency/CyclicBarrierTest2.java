package info.liangsheng.currency;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by zhong on 8/16/16.
 */
public class CyclicBarrierTest2 {

    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    c.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(1);
            }
        }).start();

        try{
            c.await();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(2);
    }


    static class  A implements  Runnable{
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
