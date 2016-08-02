package info.liangsheng.pattern.factory.method;

import info.liangsheng.pattern.factory.BMW;
import info.liangsheng.pattern.factory.BMW320;
import info.liangsheng.pattern.factory.BMW532;

/**
 * Created by zhong on 8/2/16.
 */
public class Customer {
    public static void main(String[] args) {
        BMWFactory320 factory320 = new BMWFactory320();
        BMW320  bmw320 = factory320.createBMW();

        BMWFactory532 factory532 = new BMWFactory532();
        BMW532 bmw532 = factory532.createBMW();
    }
}
