package info.liangsheng.currency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by zhong on 8/16/16.
 */
public class Cache {
    static Map<String, Object> cache = new HashMap<>();
    static ReadWriteLock rwl  = new ReentrantReadWriteLock();
    static Lock rl = rwl.readLock();
    static Lock wl = rwl.writeLock();

    public static final Object get(String key){
        rl.lock();
        try{
            Object value = cache.get(key);
            return value;
        }finally {
            rl.unlock();
        }
    }


    public static void put(String key, Object value){
        wl.lock();
        try{
            cache.put(key, value);
        }finally {
            wl.unlock();
        }
    }

    public static void clear(){
        wl.lock();
        try{
            cache.clear();
        }finally {
            wl.unlock();
        }
    }
}
