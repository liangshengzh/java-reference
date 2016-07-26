package cn.devlab.session;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by zhong on 7/26/16.
 */
@EnableRedisHttpSession
public class Config {

    @Bean
    public JedisConnectionFactory connectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("192.168.99.100");
        factory.setPort(32860);
        return factory;
    }
}
