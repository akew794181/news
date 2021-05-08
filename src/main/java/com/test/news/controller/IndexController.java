package com.test.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zengliming
 * @date 2018/3/20 16:49
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
