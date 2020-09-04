package con.dyzwj.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwj
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2020年01月11日 14:47:00
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
