package cn.devlab.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by zhonlian on 2016/8/9.
 */
public class MyBatisUtil {
    private static SqlSessionFactory factory;

    private MyBatisUtil() {
    }

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        }catch (Exception e){
            throw  new RuntimeException(e.getMessage(), e);
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSessionFactory(){
        return factory;
    }
}
