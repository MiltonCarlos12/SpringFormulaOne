package com.gaort.formulaOne.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teams")
public class APITeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    public @ResponseBody Iterable<Team> showAllInfo(){
        return teamService.getAllData();
    }
}
