package com.nt.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service("seasonService")
public class SeasonFinderControllerImp implements SeasonFinderService {
    @Override
    public String findSeason() {

        String season = null;
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();

        if (month >= 7 && month <= 9) {
            season = "Spring";


        } else if (month >= 3 && month <= 6) {
            season = "Summer";
        } else {
            season = "Autumn";
        }
        return season;
    }
}
