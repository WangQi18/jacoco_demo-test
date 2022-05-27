package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say() {
        return "Hello World!";
    }

    @RequestMapping("haaaha")
    public String haaaha() {
        return "ha32ha!";
    }

    @RequestMapping("qwer")
    public String qwer() {
        return "2333!";
    }

    @RequestMapping("weqweq")
    public String weqweq() {
        return "2333!";
    }




}
