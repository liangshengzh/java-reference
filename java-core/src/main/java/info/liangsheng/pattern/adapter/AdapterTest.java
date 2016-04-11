package info.liangsheng.pattern.adapter;

/**
 * Created by zhong on 3/22/16.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
