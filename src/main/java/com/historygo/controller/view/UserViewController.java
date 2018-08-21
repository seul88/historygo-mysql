package com.historygo.controller.view;


import com.historygo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserViewController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }



}
