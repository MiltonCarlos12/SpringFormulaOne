package com.gaort.formulaOne.Team;

import com.gaort.formulaOne.Country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private final CountryRepository countryRepository;
    @Autowired
    public TeamService (TeamRepository teamRepository, CountryRepository countryRepository){
        this.teamRepository = teamRepository;
        this.countryRepository = countryRepository;
    }

    public Iterable<Team> getAllData() {
        return teamRepository.findAll();
    }

    public String addNewTeam(String name, int idCountry) {
        Team newTeam = new Team();
        newTeam.setTeamCountry(countryRepository.findById(idCountry).get());
        newTeam.setNameTeam(name);
        teamRepository.save(newTeam);
        return "Saved";
    }
}
