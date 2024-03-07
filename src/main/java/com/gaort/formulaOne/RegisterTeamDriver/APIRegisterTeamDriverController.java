package com.gaort.formulaOne.RegisterTeamDriver;

import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teamDriver")
public class APIRegisterTeamDriverController {

    private final RegisterTeamDriverService registerTeamDriverService;

    @Autowired
    public APIRegisterTeamDriverController(RegisterTeamDriverService registerTeamDriverService){
        this.registerTeamDriverService = registerTeamDriverService;
    }


    @GetMapping("/")
    public @ResponseBody Iterable<RegisterTeamDriver> showAllInformation(){
        return registerTeamDriverService.getAllData();
    }

}
