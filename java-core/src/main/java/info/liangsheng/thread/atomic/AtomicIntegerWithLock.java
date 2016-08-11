package info.liangsheng.thread.atomic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhonlian on 2016/8/10.
 */
public class AtomicIntegerWithLock {
    private int value;
    private Lock lock = new ReentrantLock();

    public AtomicIntegerWithLock() {
    }

    public AtomicIntegerWithLock(int value) {
        this.value = value;
    }

    public final int get(){
        lock.lock();
        try{
            return value;
        }finally {
            lock.unlock();
        }
    }

    public final void set(int newValue){
        lock.lock();
        try{
            value = newValue;
        }finally {
            lock.unlock();

        }
    }

    public final int getAndSet(int newValue){
        lock.lock();
        try{
            int ret = value;
            value = newValue;
            return ret;
        }finally {
            lock.unlock();
        }
    }


    public final boolean compareAndSet(int expect, int update){
        lock.lock();
        try{
            if(value == expect){
                value = update;
                return true;
            }
            return false;
        }finally {
            lock.unlock();
        }
    }

    public final int getAndIncrement(){
        lock.lock();
        try{
            int ret = value;
            value++;
            return ret;
        }finally {
            lock.unlock();
        }
    }

    public final int getAndDecrement(){
        lock.lock();
        try{
            return value--;
        }finally {
            lock.unlock();
        }
    }

    public final int incrementAndGet(){
        lock.lock();
        try{
            return ++value;
        }finally {
            lock.unlock();
        }
    }

    public final int decrementAndGet(){
        lock.lock();
        try{
            return --value;
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws  Exception{
        final int max = 10;
        final int loopCount = 10000;
        long costTime = 0;

        long start = System.nanoTime();
        AtomicIntegerWithLock value1 = new AtomicIntegerWithLock(0);
        Thread[] ts = new Thread[max];
        for(int i = 0; i< max; i++){
            ts[i] = new Thread(){
                @Override
                public void run() {
                    for(int j =0; j< loopCount; j++){
                        value1.incrementAndGet();
                    }
                }
            };
        }

        for(Thread t :ts){
            t.start();
        }

        for(Thread t : ts){
            t.join();
        }
        long end = System.nanoTime();
        costTime += (end-start);
        System.out.println("cost:" + costTime);

        final  Object lock = new Object();

        start = System.nanoTime();
        Thread[] ts1 = new Thread[max];
        for (int m = 0; m < max; m++) {

                ts1[m] = new Thread() {
                    public void run() {
                        for (int i = 0; i < loopCount; i++) {
                            synchronized(lock) {
                                ++staticValue;
                            }
                        }
                    }
                };
        }
        for(Thread t :ts1){
            t.start();
        }

        for(Thread t : ts1){
            t.join();
        }
        end = System.nanoTime();
        costTime += (end-start);
        System.out.println("cost:" + costTime);


    }

    static int staticValue = 0;
}
