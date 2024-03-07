package com.gaort.formulaOne.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
