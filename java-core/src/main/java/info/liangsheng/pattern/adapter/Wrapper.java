package info.liangsheng.pattern.adapter;

/**
 * Created by zhong on 3/22/16.
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    public void method1() {
        source.method1();;
    }

    public void method2() {
        System.out.println("this is the target method ");
    }
}
