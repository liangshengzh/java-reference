package cn.devlab.service;

import cn.devlab.model.User;
import cn.devlab.model.UserMapper;
import cn.devlab.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonlian on 2016/8/9.
 */
public class UserService {
    public void insertUser(User user){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        try{
            UserMapper userMapper = session.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            session.commit();
        }finally {
            session.close();
        }

    }

    public List<User> getAllUsers(){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        List<User> users = new ArrayList<>();
        try{
            UserMapper userMapper = session.getMapper(UserMapper.class);
            users.addAll( userMapper.getAllUsers());
        }finally {
            session.close();
        }
        return users;
    }
}
