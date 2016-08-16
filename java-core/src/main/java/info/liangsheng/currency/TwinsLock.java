package info.liangsheng.currency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhong on 8/16/16.
 */
public class TwinsLock implements Lock {

    public static class Sync extends AbstractQueuedSynchronizer{

        public Sync(int count) {
            if(count <= 0){
                throw new IllegalArgumentException("count must be larger than zero");
            }

            setState(count);
        }

        @Override
        protected boolean tryReleaseShared(int returnCount) {
            for(;;){
                int current = getState();
                int newCount = current + returnCount ;
                if(compareAndSetState(current, newCount)){
                    return true;
                }
            }
        }


        @Override
        protected int tryAcquireShared(int reduceCount) {
            for(;;){
                int current = getState();
                int newCount = current - reduceCount;
                if(newCount <0 ||compareAndSetState(current, newCount)){
                    return newCount;
                }
            }
        }
    }

    private final Sync sync = new Sync(2);
    @Override
    public void lock() {
        sync.tryAcquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.releaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
