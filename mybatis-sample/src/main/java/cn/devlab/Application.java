package cn.devlab;

import cn.devlab.model.User;
import cn.devlab.service.UserService;

/**
 * Created by zhonlian on 2016/8/9.
 */
public class Application {
    public static void main(String[] args) {
        User user = new User();
        user.setEmailId("admin@example.com");
        user.setFirstName("WU");
        user.setLastName("GUO");
        user.setPassword("changeit");

        UserService userService = new UserService();
        userService.insertUser(user);

        System.out.println(userService.getAllUsers());
    }
}
