package com.historygo.controller.view;


import com.historygo.model.Places;
import com.historygo.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlaceViewController {



    @Autowired
    PlaceRepository placeRepository;


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    public String showPlaceDetails(@RequestParam ("name") String name, Model model){

        Places place;

        try {
            place = this.placeRepository.findByName(name);

            model.addAttribute("name", place.getName());
            model.addAttribute("id", place.getId());
            model.addAttribute("description", place.getDescription());
            model.addAttribute("points", place.getPoints());
            model.addAttribute("rating", place.getRating());
            model.addAttribute("year", place.getYear());
            model.addAttribute("visits", place.getVisits());
            model.addAttribute("GPS_N", place.getGPS_N());
            model.addAttribute("GPS_E", place.getGPS_E());

        }

        catch (NullPointerException ex){
            model.addAttribute("errorMessage", "Place not found!");
            return "errorMsg";
        }

        return "placeDetails";
    }
}
