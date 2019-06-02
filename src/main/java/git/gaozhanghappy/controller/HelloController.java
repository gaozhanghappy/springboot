package git.gaozhanghappy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123456 on 2019/6/2.
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @RequestMapping("/hello")
    public String hello(){
        return name;
    }
    @Value("${content}")
    private Object content;
    @RequestMapping("/helloworld")
    public Object helloWorld(){

        return content.toString();
    }
}
