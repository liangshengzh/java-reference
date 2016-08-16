package info.liangsheng.currency;

/**
 * Created by zhong on 8/15/16.
 */
public class Synchronized {

    public static void main(String[] args) {
        synchronized (Synchronized.class){
            m();
        }
    }

    public static synchronized void m(){}
}
