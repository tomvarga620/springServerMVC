package com.springMVC.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class MyController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "main-menu";
    }
}
