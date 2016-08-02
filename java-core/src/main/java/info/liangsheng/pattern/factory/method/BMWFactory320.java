package info.liangsheng.pattern.factory.method;

import info.liangsheng.pattern.factory.BMW;
import info.liangsheng.pattern.factory.BMW320;

/**
 * Created by zhong on 8/2/16.
 */
public class BMWFactory320  implements BMWFactory{
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
