package com.gaort.formulaOne.RegisterTeamDriver;

import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/teamDriver")
public class RegisterTeamDriverControlller {

    @Autowired
    private RegisterTeamDriverService registerTeamDriverService;

    @PostMapping("/add")
    public @ResponseBody String addNewTeamDriver(
            @RequestParam int number,
            @RequestParam int idDriver,
            @RequestParam int idTeam
    ) {
        return registerTeamDriverService.createNewRelationship(number, idDriver, idTeam);
    }
}
