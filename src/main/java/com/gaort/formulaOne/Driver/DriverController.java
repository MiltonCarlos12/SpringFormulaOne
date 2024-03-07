package com.gaort.formulaOne.Driver;

import com.gaort.formulaOne.Country.Country;
import com.gaort.formulaOne.Country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/drivers")
public class DriverController {

    @Autowired
    private DriverService IDriverService;

    @Autowired
    private CountryService countryService;

    /**
     * Method for showing the template (HTML model).
     * @param model : Themplate's name of HTML.
     * @return
     */
    @GetMapping(path = "/")
    public String showInterface(Model model){
        Iterable<Driver> drivers = IDriverService.getAllData();
        model.addAttribute("drivers",drivers);
        return "drivers";
    }

    /**
     * Function to add a new driver through Post method.
     * @param firstName
     * @param lastName
     * @return ResponseBody
     */
    @PostMapping(path = "/add")
    public @ResponseBody String addNewDriver(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam int idCountry){
        Country count = countryService.getById(idCountry);
        Driver d = new Driver();
        d.setNameDriver(firstName);
        d.setLastName(lastName);
        d.setDriverCountry(count);
        return IDriverService.createNewDriver(d);
    }
}
