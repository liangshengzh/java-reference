package info.liangsheng.pattern.adapter;

/**
 * Created by zhong on 3/22/16.
 */
public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is the targetable method");
    }
}
