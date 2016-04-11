package info.liangsheng.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zhong on 3/24/16.
 */
public class Main {
    public static void main(String[] args) {
        Log log = new LogImpl();
        InvocationHandler ih = new ProxyHandler(log);

        Log proxyLog = (Log) Proxy.newProxyInstance(log.getClass().getClassLoader(),log.getClass().getInterfaces(), ih);
        proxyLog.log();

    }
}
