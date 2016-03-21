package info.liangsheng.thread;

/**
 * Created by zhong on 3/20/16.
 */
public class JoinTest implements  Runnable{

    private static int a = 0;
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            a = a + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        JoinTest joinTest = new JoinTest();
        Thread t  = new Thread(joinTest);
        t.start();
        t.join();
        System.out.println(a);

    }
}
