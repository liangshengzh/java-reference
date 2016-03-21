package info.liangsheng.pattern.builder;

/**
 * Created by zhong on 3/21/16.
 */
public class Customer {
    private  String name;
    private String sex;
    private  int age;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder{
        private  String name;
        private String sex;
        private  int age;
        private String address;
        private String phone;
        public Builder(String name){
            this.name  = name;
        }

       public Builder setSex(String sex){
           this.sex = sex;
           return this;
       }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    private Customer(Builder builder){
        this.name =builder.name;
        this.phone = builder.phone;
        this.sex = builder.sex;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
