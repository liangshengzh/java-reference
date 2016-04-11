package info.liangsheng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhong on 3/24/16.
 */
public class ProxyHandler implements InvocationHandler{
    private Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before invoking method...");
        Object object = method.invoke(target, args);
        System.out.println("After invoking method");

        return object;
    }
}
