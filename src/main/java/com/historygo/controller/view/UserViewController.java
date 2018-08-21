package com.historygo.controller.view;


import com.historygo.model.Users;
import com.historygo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class UserViewController {



    @Autowired
    UserRepository userRepository;



    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/userDetails")
    public String showUserDetails(@RequestParam("name") String name, Model model) {
        Users user;
        user = userRepository.findByName(name);

        try {
            user = userRepository.findByName(name);
            model.addAttribute("name", user.getName());
            model.addAttribute("points", user.getPoints());
            model.addAttribute("id", user.getId());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("country", user.getCountry());

        }
        catch (NullPointerException ex){
            model.addAttribute("errorMessage", "Player not found!");
            return "errorMsg";
        }


        return "userDetails";
    }


    @PostMapping("/delete")
    public String deleteUser(@RequestParam("name") String name){
        Users user;
        user = userRepository.findByName(name);
        if (user != null) {
            userRepository.delete(user);
        }
        return "redirect:/";
    }


    @PostMapping("/addUser")
    public String addUser(@RequestParam("name") String name){
        Users user = new Users();
        user.setName(name);
        user.setPoints(0);
        if (user.getName() != null && user.getName() != "")
            if (userRepository.findByName(name) == null)
                userRepository.save(user);

        return "redirect:/";
    }


    @PostMapping("/listUsers")
    public String listUsers(ModelMap model){
        ArrayList<Users> users = new ArrayList<>();
        users = (ArrayList<Users>) userRepository.findAll();
        model.addAttribute("users", users);

        return "usersList";
    }


}
