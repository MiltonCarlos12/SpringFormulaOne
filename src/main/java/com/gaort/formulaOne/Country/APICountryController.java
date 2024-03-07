package com.gaort.formulaOne.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/countries")
public class APICountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public @ResponseBody Iterable<Country> getAllCountries(){
        return countryService.getAllData();
    }

    @GetMapping("{id}")
    public @ResponseBody Country getOnlyOneElement(@RequestParam int idCountry){
        return countryService.getById(idCountry);
    }
}
