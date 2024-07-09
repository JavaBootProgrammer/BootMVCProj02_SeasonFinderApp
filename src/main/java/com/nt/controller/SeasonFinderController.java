package com.nt.controller;


import com.nt.service.SeasonFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SeasonFinderController {

    @Autowired
    private SeasonFinderService seasonFinderService;

    @RequestMapping("/welcome")
    public String homePage() {
        System.out.println("home page displayed");

        return "welcome";
    }

    @RequestMapping("/season")
    public String displaySeason(Map<String, Object> map) {
        String season = seasonFinderService.findSeason();
        map.put("season", season);
        System.out.println("displaySeason page displayed");
        return "displaySeason";
    }
}
