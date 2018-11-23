package com.thymeleaf.demo.controller;


import com.thymeleaf.demo.domain.Users;
import com.thymeleaf.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 测试jpaCURD
 */
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;
    /*
    * 查询
    * */
    @RequestMapping("/list")
    public String list(Model model){
        List<Users> usersList=usersService.findAll();
        model.addAttribute("usersList",usersList);
        return "users/list";
    }

}
