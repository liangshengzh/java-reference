package info.liangsheng.currency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhong on 8/16/16.
 */
public class ConditionUseCase {

    static Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void conditionWait()throws InterruptedException{
        lock.lock();
        try{
            condition.await();
        }finally {
            lock.unlock();
        }
    }

    public void conditionSinginal(){
        lock.lock();
        try{
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
