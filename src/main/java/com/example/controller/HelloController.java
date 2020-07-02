package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @RequestMapping("/hello")
    public Object hello(String name){
       String aaa="aaa";
       String bbb="bbb";
       for (int i = 0; i < 20; i++) {
           int a = i+1;
           System.out.println(i);
       }
       return "hello my word";
    }

}
