package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("bye")
    public String greetBye(){
        return "<h2> byeee </h2>";
    }
}
