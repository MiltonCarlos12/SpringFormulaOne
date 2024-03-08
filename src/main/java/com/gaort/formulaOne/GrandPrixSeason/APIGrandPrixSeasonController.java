package com.gaort.formulaOne.GrandPrixSeason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/grandPrixesSeasons")
public class APIGrandPrixSeasonController {

    private final GrandPrixSeasonService grandPrixSeasonService;

    @Autowired
    public APIGrandPrixSeasonController (GrandPrixSeasonService grandPrixSeasonService){
        this.grandPrixSeasonService = grandPrixSeasonService;
    }

    @GetMapping("/")
    public Iterable<GrandPrixSeason> getAllInformation(){
        return grandPrixSeasonService.getAllData();
    }
}
