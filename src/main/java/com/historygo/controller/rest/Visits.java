package com.historygo.controller.rest;


import com.historygo.model.Places;
import com.historygo.model.Users;
import com.historygo.repository.PlaceRepository;
import com.historygo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

/*
    @GetMapping(path="/places/user")
    public String showPlacesForUser(@RequestParam String userName){

        String places = this.userRepository.findByName(userName).getPlacesAsString();
        return places;

    }
*/
    @GetMapping(path="/places/user")
    public List<Places> showPlacesForUserAsList(@RequestParam String userName){

        List<Places> places = (List<Places>) this.userRepository.findByName(userName).getPlaces();
        return places;

    }

    @GetMapping(path="/users/place")
    public List<Users> showUsersForPlacesAsList(@RequestParam String placeName) {
        List<Users> users = this.userRepository.findAll();
        List<Users> result = new ArrayList<>();

        for (Users temp : users){
            for (Places tempPlace : temp.getPlaces()){
                if (tempPlace.getName().equals(placeName))
                    result.add(temp);
            }
        }

        return result;

    }

    /*
    @GetMapping(path="/users/place")
    public List<Users> showUsersForPlacesAsList(@RequestParam String placeName) {
        List<Users> users = this.placeRepository.findByName(placeName).getUsersAsList();
        return users;
    }
    */
}
