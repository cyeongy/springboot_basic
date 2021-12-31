package com.example.springboot_basic.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/")
    public String Hello(){
        return "Hello World!";
    }

}
