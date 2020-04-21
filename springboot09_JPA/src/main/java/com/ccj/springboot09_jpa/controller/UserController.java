package com.ccj.springboot09_jpa.controller;

import com.ccj.springboot09_jpa.entity.User;
import com.ccj.springboot09_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") int id){
        return (User) userRepository.getOne(id);
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public User insertUser(User user){
        User user1 = userRepository.save(user);
        return user1;
    }

}
