package com.gaort.formulaOne.Driver;

import com.gaort.formulaOne.Views.DriversByYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIDriverController {

    @Autowired
    private DriverService driverService;

    /**
     * Function for collection an send a JSON with all drivers through GET method.
     * @return
     */
    @GetMapping("/drivers/")
    public Iterable<Driver> obtainAllDrivers(){
        return driverService.getAllData();
    }

    /**
     * Obtain drivers by year
     */
    @GetMapping("/drivers/{year}")
    public @ResponseBody List<DriversByYear> showInformation(@PathVariable int year){
        return driverService.obtainDriversByYear(year);
    }
}
