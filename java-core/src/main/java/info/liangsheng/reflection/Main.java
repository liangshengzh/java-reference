package info.liangsheng.reflection;

import java.util.Stack;

/**
 * Created by zhong on 3/24/16.
 */
public class Main {

    public static void main(String[] args) {
        Class<?> demo = null;
        try{
            demo = Class.forName("info.liangsheng.reflection.Person");
            Person person = null;
            person = (Person)demo.newInstance();
            person.setName("zhangsan");
            System.out.println(person.getName());
        }catch (Exception e){
            e.printStackTrace();
        }

        Stack
    }
}
