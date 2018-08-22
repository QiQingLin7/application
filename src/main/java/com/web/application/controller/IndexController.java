package com.web.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午5:18 2018/8/22
 * Description：初始化首页
 */
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String Lonin() {
        return "/Login";
    }

    @GetMapping(value = "/index")
    public String Index() {
        return "index";
    }
}
