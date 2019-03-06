package com.stackroute.controller;


import com.stackroute.config.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/UserLogin")
    public ModelAndView UserLogin(@RequestParam("name")String name,@RequestParam("pwd")String password){

        User user = new User(name,password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("name",user.getName());
        //modelAndView.addObject("password-result",user.getPassword());
        return modelAndView;
    }


}
