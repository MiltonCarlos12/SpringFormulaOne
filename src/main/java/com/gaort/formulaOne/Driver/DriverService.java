package com.gaort.formulaOne.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    /**
     * Function for obtaining all data gathering Drivers from Database.
      * @return Iterable<Class.type>
     */
    public Iterable<Driver> getAllData(){
        return driverRepository.findAll();
    }

    public String createNewDriver(Driver newDriver){
        driverRepository.save(newDriver);
        return "Saved";
    }
}
