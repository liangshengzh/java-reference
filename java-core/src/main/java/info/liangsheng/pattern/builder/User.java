package info.liangsheng.pattern.builder;

/**
 * Created by zhong on 3/21/16.
 */
public class User {
    private  String name;
    private String sex;
    private  int age;
    private String address;
    private String phone;

    public User(){

    }
    public User(String name){
        this.name = name;
    }
    public User(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    public User(String name, String sex , int age){
        this.name= name;
        this.sex = sex;
        this.age = age;

    }
    public User(String name, String sex , int age, String address){
        this.name= name;
        this.sex = sex;
        this.age = age;
        this.address = address;

    }

}
