package com.gaort.formulaOne.Season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/seasons")
public class APISeasonController {

    private final SeasonService seasonService;

    @Autowired
    public APISeasonController (SeasonService seasonService){
        this.seasonService = seasonService;
    }

    @GetMapping("/")
    public Iterable<Season> getAllInformation(){
        return seasonService.getAllData();
    }
}
