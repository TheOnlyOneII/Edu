package com.imooc.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ author TheOnlyOne
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/login")
    public String index() {
        return "login";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
