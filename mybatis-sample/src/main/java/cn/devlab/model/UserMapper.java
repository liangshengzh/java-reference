package cn.devlab.model;

import java.util.List;

/**
 * Created by zhonlian on 2016/8/9.
 */
public interface UserMapper {

    public void insertUser(User user);

    public User getUserById(Integer userId);

    public List<User> getAllUsers();

    public void updateUser(User user);

    public void deleteUser(Integer userId);
}
