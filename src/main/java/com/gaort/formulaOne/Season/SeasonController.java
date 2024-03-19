package com.gaort.formulaOne.Season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/seasons")
public class SeasonController {

    private final SeasonService seasonService;

    @Autowired
    public SeasonController (SeasonService seasonService){
        this.seasonService = seasonService;
    }

    @GetMapping("/")
    public String showInterface(Model model){
        return "seasons";
    }

    @PostMapping("/add")

    public @ResponseBody String createNewSeason(
            @RequestParam int idSeason,
            @RequestParam String name,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateStart,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateEnd,
            @RequestParam int totalRaces
            ){
        Season season = new Season(idSeason, name, dateStart, dateEnd, totalRaces);
        return seasonService.addNewSeason(season);
    }
}
