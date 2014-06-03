package info.liangsheng.spring.aop;

import org.aspectj.lang.JoinPoint;

/**
 * Created by liangsheng on 6/3/14.
 */
public class ServiceAspect {
    public void doThrowing(JoinPoint jp, Throwable ex){
        System.out.println("send email");

    }
}
