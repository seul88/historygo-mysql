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
/*
        boolean isOnList = false;


        for (Users user : temp.getUsers()){

            if (user.equals(tempUsr)){
               isOnList = true;
            }
        }

        if (isOnList == false){

            int visits = temp.getVisits();
            visits++;
            temp.setVisits(visits);

            int pointsPlace = temp.getPoints();
            int pointsUser = tempUsr.getPoints();
            pointsUser += pointsPlace;
            tempUsr.setPoints(pointsUser);

            placeRepository.save(temp);
            userRepository.save(tempUsr);

            return "Visit added properly.";

        }
*/


        int visits = temp.getVisits();
        visits++;
        temp.setVisits(visits);

        int pointsPlace = temp.getPoints();
        int pointsUser = tempUsr.getPoints();
        pointsUser += pointsPlace;
        tempUsr.setPoints(pointsUser);

        placeRepository.save(temp);
        userRepository.save(tempUsr);

        return "Done";

    }
}
