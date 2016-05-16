package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhong on 4/26/16.
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public String index(){
        return "Greeting from spring boot~~!";
    }
}
