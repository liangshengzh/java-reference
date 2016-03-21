package info.liangsheng.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhong on 3/20/16.
 */
public class Test {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Consumer consumer = new Consumer(lock);
        Producer producer = new Producer(lock);
        new Thread(consumer).start();
        new Thread(producer).start();
    }
}
