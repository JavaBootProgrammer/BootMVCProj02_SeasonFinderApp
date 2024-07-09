package com.nt.controller;


import com.nt.service.SeasonFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class SeasonFinderController {

    @Autowired
    private SeasonFinderService seasonFinderService;

    @GetMapping("/welcome")
    public String homePage() {
        System.out.println("home page");

        return "welcome";
    }

    @GetMapping("/season")
    public String homePage(Map<String, Object> map) {
        String season = seasonFinderService.findSeason();
        map.put("season", season);
        return "displaySeason";
    }
}
