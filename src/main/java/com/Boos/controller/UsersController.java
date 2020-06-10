package com.Boos.controller;

import com.Boos.entity.Users;
import com.Boos.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",10000);
        return mav;
    }
    @RequestMapping("/all")
    public List<Users> finall(){
        return usersService.getAllUsers();

    }
}