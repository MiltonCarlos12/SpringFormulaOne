package com.gaort.formulaOne.Season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody String createNewSeason(@RequestBody Season season){
        return seasonService.addNewSeason(season);
    }
}
