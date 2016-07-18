package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zhonlian on 2016/5/18.
 */
@Component
public class MyBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            System.out.println("argument = " + arg);
        }
    }
}
