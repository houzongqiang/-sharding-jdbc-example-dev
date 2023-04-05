package com.lsi.hzqstock.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {

    @RequestMapping("/getName")
    public String getName(){
        return "houzq";
    }
}
