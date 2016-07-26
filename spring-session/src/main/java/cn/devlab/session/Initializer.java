package cn.devlab.session;


import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by zhong on 7/26/16.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {
    public Initializer() {
        super(Config.class);
    }


}
