package com.gaort.formulaOne.GrandPrix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/grandPrixes")
public class GrandPrixController {

    private final GrandPrixService grandPrixService;

    @Autowired
    public GrandPrixController (GrandPrixService grandPrixService){
        this.grandPrixService = grandPrixService;
    }

    @GetMapping("/")
    public String showInterface(Model model){
        return "grandprixes";
    }

    @PostMapping("/add")
    public @ResponseBody String createNewGranPrix(
            @RequestParam String name,
            @RequestParam String circuitName,
            @RequestParam int idCountry){
        return grandPrixService.addNewGranPrix(name, circuitName,idCountry);
    }
}
