package com.gaort.formulaOne.RegisterTeamDriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teamDriver")
public class RegisterTeamDriverControlller {

    @Autowired
    private RegisterTeamDriverService registerTeamDriverService;

}
