package com.gaort.formulaOne.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    public String showInterfaceTeam(Model model){
        return "teams";
    }

    @PostMapping("/add")
    public @ResponseBody String createNewTeam(
            @RequestParam String name,
            @RequestParam int idCountry){
        return teamService.addNewTeam(name, idCountry);
    }

}
