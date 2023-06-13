package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say() {
        return "Hello World!";
    }

    @RequestMapping("byebye")
    public String byebye() {
        return "byebye!";
    }

    @RequestMapping("haaaha123")
    public String haaaha() {
        return "ha32ha!123";
    }

    @RequestMapping("qwer123")
    public String qwer() {
        return "2333!12313";
    }

    @RequestMapping("newlink")
    public String weqweq() {
        return "newlink!";
    }



}
