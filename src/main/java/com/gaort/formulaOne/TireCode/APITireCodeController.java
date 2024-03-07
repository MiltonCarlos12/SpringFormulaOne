package com.gaort.formulaOne.TireCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tireCodes")
public class APITireCodeController {

    private final TireCodeService tireCodeService;

    @Autowired
    public APITireCodeController (TireCodeService tireCodeService){
        this.tireCodeService = tireCodeService;
    }

    @GetMapping("/")
    public Iterable<TireCode> getAllInformation(){
        return tireCodeService.getAllData();
    }
}
