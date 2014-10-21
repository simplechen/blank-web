package com.yourdomain.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yourdomain.po.User;

@Controller  
@RequestMapping("/user")  
public class UserController {  
  
    @RequestMapping("/{id}")  
    public ModelAndView view(@PathVariable("id") Long id, HttpServletRequest req) {
    	
    	System.err.println("---debug---");
        User user = new User(); 
        user.setId(id);  
        user.setName("zhang");  
  
        ModelAndView mv = new ModelAndView();  
        mv.addObject("user", user);  
        mv.setViewName("user/view");  
        
        return mv;  
    }  
}  

