package com.example.springboot_basic.web;

import com.example.springboot_basic.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}
