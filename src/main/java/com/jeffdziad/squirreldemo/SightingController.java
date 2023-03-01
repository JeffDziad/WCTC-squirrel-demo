package com.jeffdziad.squirreldemo;

import com.jeffdziad.squirreldemo.IService.LocationService;
import com.jeffdziad.squirreldemo.IService.SightingService;
import com.jeffdziad.squirreldemo.IService.SquirrelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SightingController {

    @Autowired
    private SquirrelService squirrelService;
    @Autowired
    private SightingService sightingService;
    @Autowired
    private LocationService locationService;

    @GetMapping("/report")
    public String showSightingForm() {
        return "sighting-form";
    }

    @GetMapping("/list")
    public String showSquirrelList(Model model) {
        model.addAttribute("squirrelList", squirrelService.getSquirrelList());
        return "squirrel-list";
    }

    @PostMapping("/save")
    public String saveSighting() {
        return "confirmation";
    }

    @GetMapping("/sightings")
    public String showSightingsList() {
        return "sighting-list";
    }

}
