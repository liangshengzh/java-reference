package info.liangsheng.pattern.factory.abs;

import info.liangsheng.pattern.factory.BMW;

/**
 * Created by zhong on 8/2/16.
 */
public interface BMWFactory  {
    BMW createBMW();
    Aircondition createAdirC();
}
