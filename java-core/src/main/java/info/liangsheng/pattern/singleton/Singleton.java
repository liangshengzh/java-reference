package info.liangsheng.pattern.singleton;

/**
 * Created by zhong on 3/21/16.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        synchronized (instance){
            if(instance == null){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
