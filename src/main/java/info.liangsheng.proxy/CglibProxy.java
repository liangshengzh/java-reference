package info.liangsheng.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by liangsheng on 6/2/14.
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object bind(Object target){
        this.target=target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin method");
        methodProxy.invokeSuper(o,objects);
        System.out.println("after method");
        return null;
    }
}
