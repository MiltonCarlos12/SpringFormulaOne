package com.gaort.formulaOne.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/countries")
public class CoutryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String showInterfaceCountry(Model model){
        return "countries";
    }

    @PostMapping("/add")
    public @ResponseBody String addNewCountry(@RequestParam String nameCountry){
        Country country = new Country();
        country.setCountryName(nameCountry);
        return countryService.saveNewCountry(country);
    }
}
