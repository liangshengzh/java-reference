package info.liangshneg.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: zhongl
 * Date: 8/6/14
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class CountingAfterReturningAdvice  extends  MethodCounter implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        count(method);
    }
}
