package info.liangsheng.jcip;

import java.util.concurrent.Executors;

/**
 * Created by zhonlian on 2016/8/11.
 */
public class Novisibility {
    private static boolean ready;
    private static int number;

    public static class Reader extends Thread{
        @Override
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Thread t = new Reader();
        t.start();
        ready = true;
        number = 3;
    }
}
