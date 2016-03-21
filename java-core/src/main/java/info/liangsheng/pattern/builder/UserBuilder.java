package info.liangsheng.pattern.builder;

public class UserBuilder {
    private String name;
    private String sex;
    private int age;
    private String address;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User createUser() {
        return new User(name);
    }
}