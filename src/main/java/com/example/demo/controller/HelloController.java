package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.User;

@RestController
public class HelloController {
    //无参：
    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }
    //前端传值：
    @GetMapping("/helloUser")
    public String helloUser(@RequestParam(defaultValue = "") String name){
        System.out.println(name);
        return "Welcome to SpringBoot,"+name+"!";
    }
    //参数写在路径里：
    @GetMapping("/hello/{name}")
    public String helloUsername(@PathVariable String name){
        System.out.println(name);
        return "Welcome to SpringBoot,"+name+"!";
    }

    //接收json包
    @PostMapping("/User")
    public String showUserInfo(@RequestBody User user){
        System.out.println("name:"+user.getName()+",birthdate:"+user.getBirthdate());
        return "name:"+user.getName()+",birthdate:"+user.getBirthdate();
    }

}
