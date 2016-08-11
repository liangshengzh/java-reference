package info.liangsheng.annotation;

import java.lang.annotation.*;

/**
 * Created by zhonlian on 2016/8/10.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Description {
    String value();
}
