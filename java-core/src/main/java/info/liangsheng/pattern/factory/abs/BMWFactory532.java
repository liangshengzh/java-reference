package info.liangsheng.pattern.factory.abs;

import info.liangsheng.pattern.factory.BMW532;

/**
 * Created by zhong on 8/2/16.
 */
public class BMWFactory532 implements BMWFactory {
    @Override
    public BMW532 createBMW() {
        return new BMW532();
    }

    @Override
    public Aircondition createAdirC() {
        return new AirconditionBMW532();
    }
}
