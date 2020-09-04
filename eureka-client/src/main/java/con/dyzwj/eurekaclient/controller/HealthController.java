package con.dyzwj.eurekaclient.controller;

import con.dyzwj.eurekaclient.config.health.CustomHealthCheacker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwj
 * @version 1.0.0
 * @ClassName HealthController.java
 * @Description TODO
 * @createTime 2020年01月11日 14:52:00
 */
@RestController
public class HealthController {

    @Autowired
    private CustomHealthCheacker customHealthCheacker;

    @GetMapping("/up")
    public String up(@RequestParam("up") boolean up){
        customHealthCheacker.setUp(up);
        return customHealthCheacker.isUp() ? "UP" : "DOWN";

    }
}
