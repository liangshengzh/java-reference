package info.liangsheng.thread.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Created by zhonlian on 2016/8/10.
 */
public class AtomicIntegerArrayMain {
    class User{
        public volatile int age;
        private String userName;
    }

    AtomicIntegerFieldUpdater<User> getUpdater(String fieldName){
        return AtomicIntegerFieldUpdater.newUpdater(User.class, fieldName);
    }

    void doit(){
        User user = new User();
        System.out.println("1 ==>" + getUpdater("age").getAndSet(user, 10));

    }

    public static void main(String[] args) {
        AtomicIntegerArrayMain demo = new AtomicIntegerArrayMain();
        demo.doit();
    }
}
