package com.ljf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@Author Liu jiefeng
 *@Date 2018/12/3 16:17
 *@Version 1.0
 *@Description TODO
 **/
@Controller
public class DemoController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
