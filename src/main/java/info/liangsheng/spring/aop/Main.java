package info.liangsheng.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * Created by liangsheng on 6/3/14.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ActivationService activationService  = (ActivationService) context.getBean("activationService");
        activationService.getActivation();
    }
}
