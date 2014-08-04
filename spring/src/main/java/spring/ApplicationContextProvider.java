package spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by liangsheng on 6/3/14.
 */
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext context = null;
    public static ApplicationContext getContext(){
        return context;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
