package com.gaort.formulaOne.GrandPrix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/grandPrixes")
public class APIGrandPrixController {

    private final GrandPrixService grandPrixService;

    @Autowired
    public APIGrandPrixController (GrandPrixService grandPrixService){
        this.grandPrixService = grandPrixService;
    }

    @GetMapping("/")
    public @ResponseBody Iterable<GrandPrix> obtainAllInformation(){
        return grandPrixService.getAllData();
    }
}
