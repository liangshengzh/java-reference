package info.liangsheng.pattern.builder;

/**
 * Created by zhong on 3/21/16.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Customer customer = new Customer.Builder("Zhangsan").setAge(10).setAddress("Shanghai").setPhone("1232321321").setSex("F").build();
        System.out.println(customer);
    }
}
