package com.dyzwj.producerhello.controller;

import com.dyzwj.producerhello.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zwj
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2020年01月13日 10:20:00
 */

@RestController
@RequestMapping("/hello")
public class HelloController {


    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String hello(User user){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello:" + port + "user:" + user;
    }

    @GetMapping("/world")
    public String world(User user){

        return "world:" + port + "user:" + user;
    }

    @PostMapping("/post1")
    public String post1(@RequestBody User user){
        return user.toString();
    }


    @GetMapping("/path/{id}")
    public String path(@PathVariable String id){
        return id;
    }




}
