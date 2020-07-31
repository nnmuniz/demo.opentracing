package com.example.demo.opentracing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    @GetMapping
    public String hello() {
        System.out.println("Hello from Opentracing Jaeger!");
        return "Hello from Opentracing Jaeger!";
    }
}