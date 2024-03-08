package com.gaort.formulaOne.GrandPrixSeason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/grandPrixesSeasons")
public class GrandPrixSeasonController {

    private final GrandPrixSeasonService grandPrixSeasonService;

    @Autowired
    public GrandPrixSeasonController (GrandPrixSeasonService grandPrixSeasonService){
        this.grandPrixSeasonService = grandPrixSeasonService;
    }

    @GetMapping("/")
    public String showInterface(Model model){
        return "GrandPrixesSeasons";
    }

    @PostMapping("/add")
    public @ResponseBody String createGrandPrixSeason(
            @RequestParam int idGrandPrix,
            @RequestParam int idSeason,
            @RequestParam int idTireCode
    ){
        return grandPrixSeasonService.addNewGrandPrixSeason(idGrandPrix,idSeason,idTireCode);

    }
}

