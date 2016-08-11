package info.liangsheng.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhonlian on 2016/8/10.
 */
public class IntegerMain {
    public static void main(String[] args) {
       final AtomicInteger value = new AtomicInteger(10);

        System.out.println(value.get());
        System.out.println(value.getAndAdd(3));
        System.out.println(value.get());
        System.out.println(value.getAndSet(5));
        System.out.println(value.compareAndSet(10, 2));
    }
}
