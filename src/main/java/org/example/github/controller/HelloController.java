package org.example.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author fengyunlong
 * @Date 2022/9/21 16:56
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }
}
