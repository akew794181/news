package com.test.news.controller.system;

import com.test.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zengliming
 * @date 2018/3/20 17:52
 */
@Controller
@RequestMapping(value = "system")
public class SystemController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String index(){
        return "system";
    }

    @GetMapping(value = "/userList.htm")
    public String userList(Model model){
        model.addAttribute("list",userService.findAll());
        return "user/list";
    }


}
