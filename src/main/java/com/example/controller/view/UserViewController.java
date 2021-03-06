package com.example.controller.view;



import com.example.model.Role;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class UserViewController {



    @Autowired
    UserRepository userRepository;


    @RequestMapping("/menu")
    public String index() {
        return "index";
    }


    @RequestMapping("/userDetails")
    public String showUserDetails(@RequestParam("name") String name, Model model) {
        User user;

        try {
            user = userRepository.findByName(name);
            model.addAttribute("name", user.getName());
            model.addAttribute("points", user.getPoints());
            model.addAttribute("id", user.getId());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("country", user.getCountry());
            model.addAttribute("places", user.getPlaces());
        }
        catch (NullPointerException ex){
            model.addAttribute("errorMessage", "Player not found!");
            return "errorMsg";
        }


        return "userDetails";
    }



    @PostMapping("/delete")
    public String deleteUser(@RequestParam("name") String name){
        User user;
        user = userRepository.findByName(name);
        if (user != null) {
            userRepository.delete(user);
        }
        return "redirect:/admin/menu/listUsers";
    }


    @PostMapping("/addUser")
    public String addUser(@RequestParam("name") String name){
        User user = new User();
        user.setName(name);
        user.setPoints(0);
        if (user.getName() != null && user.getName() != "")
            if (userRepository.findByName(name) == null)
                userRepository.save(user);

        return "redirect:/admin/menu";
    }

    @PostMapping("/addUserWithDetails")
    public String addUserWithDetails(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("country") String country){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
        user.setPoints(0);

        if (user.getName() != null && user.getName() != "")
            if (userRepository.findByName(name) == null)
                userRepository.save(user);

        return "redirect:/admin/menu";
    }


    @GetMapping("/listUsers")
    public String listUsersGet(ModelMap model){
        ArrayList<User> users = new ArrayList<>();
        users = (ArrayList<User>) userRepository.findAll();
        model.addAttribute("users", users);

        return "usersList";
    }

    @PostMapping("/listUsers")
    public String listUsers(ModelMap model){
        ArrayList<User> users = new ArrayList<>();
        users = (ArrayList<User>) userRepository.findAll();
        ArrayList<User> players = new ArrayList<>();
        for (User user : users){
            for (Role role : user.getRoles()){
                if (role.getRole().equals("ADMIN")){
                }
                else {
                    players.add(user);
                }
            }
        }

        model.addAttribute("users", players);
        return "usersList";
    }

}
