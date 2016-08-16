package info.liangsheng.currency;

/**
 * Created by zhong on 8/15/16.
 */
public class ThreadState {

    public static void main(String[] args) {

        Thread t1 = new Thread(new TimeWaiting(),"TimeWaiting Thread");
        Thread t2 = new Thread(new Waiting(),"Waiting Thread");
        Thread t3 = new Thread(new Blocked(), "Blocked Thread1");
        Thread t4 = new Thread(new Blocked(),"Blocked Thread2");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(200);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }
    }

    static class Waiting implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                   try {
                       Waiting.class.wait();
                   }catch (InterruptedException ie){
                       ie.printStackTrace();
                   }
                }
            }
        }
    }

    static class Blocked implements Runnable{
        @Override
        public void run() {
            synchronized (Blocked.class){
                while (true){
                    try{Thread.sleep(200);}catch (InterruptedException ie){
                        ie.printStackTrace();}
                }
            }
        }
    }
}
