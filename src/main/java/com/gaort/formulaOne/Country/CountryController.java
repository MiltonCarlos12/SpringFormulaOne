package com.gaort.formulaOne.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String showInterfaceCountry(Model model){
        return "countries";
    }

    /**
     * Creating a new country with the name only.
     * @param nameCountry: String with the name of the new country.
     * @return String: It returns a string confirmation massage.
     */
    @PostMapping("/add")
    public @ResponseBody String addNewCountry(@RequestParam String nameCountry){
        Country country = new Country();
        country.setCountryName(nameCountry);
        return countryService.saveNewCountry(country);
    }
}
