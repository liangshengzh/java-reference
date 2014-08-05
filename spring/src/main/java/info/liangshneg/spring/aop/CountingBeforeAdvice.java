package info.liangshneg.spring.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: zhongl
 * Date: 8/5/14
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
       count(method);
    }
}
