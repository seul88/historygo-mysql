package com.historygo.controller.rest;


import com.historygo.model.Places;
import com.historygo.model.Users;
import com.historygo.repository.PlaceRepository;
import com.historygo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/visits")
public class Visits {

    @Autowired
    PlaceRepository placeRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewVisit(@RequestParam String userName, @RequestParam String placeName) {

        Places temp;
        temp = placeRepository.findByName(placeName);

        Users tempUsr;
        tempUsr = userRepository.findByName(userName);

        temp.addUser(tempUsr);
        placeRepository.save(temp);

        return "Done";
    }
}
