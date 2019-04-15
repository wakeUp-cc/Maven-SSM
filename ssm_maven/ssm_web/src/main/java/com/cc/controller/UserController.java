package com.cc.controller;

import com.cc.domain.User;
import com.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user = service.findAll(1);
        model.addAttribute("user",user);
        return "success";
    }

}
