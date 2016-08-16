package info.liangsheng.currency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhong on 8/16/16.
 */
public class BoundedQueue {

    private Object[] items;

    private int count;
    private int addIndex;
    private int removeIndex;

    private Lock lock = new ReentrantLock();
    private Condition fullCondition = lock.newCondition();
    private Condition notEmptyCondition= lock.newCondition();
    public BoundedQueue(int size){
        items = new Object[size];
    }

    public void add(Object item)throws  InterruptedException{
        lock.lock();
        try{
            while (count == items.length){
                fullCondition.await();
            }

            items[addIndex] = item;
            addIndex++;
            count++;
            notEmptyCondition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public Object remove() throws InterruptedException{
        lock.lock();

        try {
            while (count == 0){
                notEmptyCondition.await();
            }

            removeIndex--;
           fullCondition.signalAll();
        }finally {
            lock.unlock();
        }
        return  null;
    }



}
