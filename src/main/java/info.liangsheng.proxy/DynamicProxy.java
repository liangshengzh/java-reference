package info.liangsheng.proxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liangsheng on 5/28/14.
 */
    public class DynamicProxy implements InvocationHandler {
        private Object target;

        public DynamicProxy(Object target) {
            this.target = target;
        }

        public Object bind() {
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = null;
            System.out.println("before method");
            result = method.invoke(target, args);
            System.out.println("end method");
            return result;
        }
    }
