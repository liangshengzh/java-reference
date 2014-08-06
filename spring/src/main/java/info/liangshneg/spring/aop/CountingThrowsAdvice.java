package info.liangshneg.spring.aop;

import org.springframework.aop.ThrowsAdvice;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhongl
 * Date: 8/6/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class CountingThrowsAdvice extends  MethodCounter implements ThrowsAdvice {
     public void afterThrowing(IOException ex) throws  Throwable{
               count(IOException.class.getName());
     }
    public void afterThrowing(IndexOutOfBoundsException ex)throws Throwable{
             count(IndexOutOfBoundsException.class.getName());
    }
}
