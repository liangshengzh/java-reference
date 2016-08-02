package info.liangsheng.pattern.factory.simple;

import info.liangsheng.pattern.factory.BMW;
import info.liangsheng.pattern.factory.BMW320;
import info.liangsheng.pattern.factory.BMW532;

/**
 * Created by zhong on 8/2/16.
 */
public class BMWFactory {

    public BMW createBMW(int type){
        switch (type){
            case 320:
                return new BMW320();
            case 532:
                return new BMW532();
        }
        return null;
    }
}
