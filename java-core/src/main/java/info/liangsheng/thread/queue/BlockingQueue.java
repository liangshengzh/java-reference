package info.liangsheng.thread.queue;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhong on 3/20/16.
 */
public class BlockingQueue {
    private List queue = new LinkedList();
    private int limit = 10;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) throws Exception{
        while (this.queue.size() == limit){
            wait();
        }
        if(queue.size() == 0){
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized  Object dequue()throws  Exception{
        while (this.queue.size() == 0){
            wait();
        }
        if(queue.size() == this.limit){
            notifyAll();
        }
        return this.queue.remove(0);
    }
}
