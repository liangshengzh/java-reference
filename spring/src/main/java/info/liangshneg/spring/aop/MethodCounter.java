package info.liangshneg.spring.aop;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhongl
 * Date: 8/5/14
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MethodCounter implements Serializable {
     private Map<String,Integer> map = new HashMap<String,Integer>();
     private int allCount;
    protected void count(Method method){
             count(method.getName());
    }

    protected void count(String methodName) {
        Integer i = map.get(methodName);
        i = (i != null)? new Integer(i + 1):1;
        map.put(methodName,i);
        ++allCount;
    }
    public int getCalls(String methodName){
        return map.get(methodName);
    }
    public int getCalls(){
        return allCount;
    }

}
