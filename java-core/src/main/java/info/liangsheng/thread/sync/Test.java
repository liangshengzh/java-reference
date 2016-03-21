package info.liangsheng.thread.sync;

import info.liangsheng.thread.sync.Consumer;
import info.liangsheng.thread.sync.Producer;

/**
 * Created by zhong on 3/20/16.
 */
public class Test {

    public static final Object obj = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Consumer());
        Thread t2 = new Thread(new Producer());
        t1.start();
        t2.start();
    }
}
