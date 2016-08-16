package info.liangsheng.currency;

import sun.awt.windows.ThemeReader;

/**
 * Created by zhong on 8/14/16.
 */
public class DeadLockDemo {
    public static  String A="A";
    public static  String B="B";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }
    public void deadLock(){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println(1);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B){
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    synchronized (A){
                        System.out.println(2);
                    }
                }


            }
        });

        t1.start();
        t2.start();
    }
}
