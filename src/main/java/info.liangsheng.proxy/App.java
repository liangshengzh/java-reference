package info.liangsheng.proxy;

import sun.misc.ProxyGenerator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutionException;

public class App
    {
        public static void main( String[] args )throws Exception
        {
    //        IAccountDao accountDao= new AccountDaoProxyImpl(new AccountDaoImpl());
    //        accountDao.update();
    //        accountDao.delete();
//            IAccountDao accountDao=new AccountDaoImpl();
//            DynamicProxy proxy = new DynamicProxy(accountDao);
//            accountDao =(IAccountDao) proxy.bind();
//            accountDao.update();
//            accountDao.delete();
//
//            byte[] proxyClass=  ProxyGenerator.generateProxyClass(accountDao.getClass().toString(),new Class[]{IAccountDao.class});
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream("$Proxy0.class"));
//            dos.write(proxyClass);
//            dos.close();

            CglibProxy cglibProxy = new CglibProxy();
            //UserDao userDao =(UserDao)cglibProxy.bind(new UserDao());
           // userDao.update();

        }
    }
