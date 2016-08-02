package info.liangsheng.pattern.factory.simple;

/**
 * Created by zhong on 8/2/16.
 */
public class Customer {

    public static void main(String[] args) {
        BMWFactory factory = new BMWFactory();
        factory.createBMW(320);
        factory.createBMW(532);
    }
}
