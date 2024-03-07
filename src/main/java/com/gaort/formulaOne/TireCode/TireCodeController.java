package com.gaort.formulaOne.TireCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tireCodes")
public class TireCodeController {

    private final TireCodeService tireCodeService;

    @Autowired
    public TireCodeController (TireCodeService tireCodeService){
        this.tireCodeService = tireCodeService;
    }

    @GetMapping("/")
    public String showInterface(Model model){
        return "TireCodes";
    }

    @PostMapping("/add")
    public @ResponseBody String createTireCode(
            @RequestParam String nameCode
    ){
        return tireCodeService.addNewTireCode(nameCode);
    }
}
