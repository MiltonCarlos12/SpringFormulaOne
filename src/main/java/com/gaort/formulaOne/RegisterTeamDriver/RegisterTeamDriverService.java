package com.gaort.formulaOne.RegisterTeamDriver;

import com.gaort.formulaOne.Driver.Driver;
import com.gaort.formulaOne.Driver.DriverRepository;
import com.gaort.formulaOne.Season.SeasonRepository;
import com.gaort.formulaOne.Team.TeamRepository;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterTeamDriverService {

    private final RegisterTeamDriverRepository registerTeamDriverRepository;
    private final DriverRepository driverRepository;
    private final TeamRepository teamRepository;

    private final SeasonRepository seasonRepository;

    @Autowired
    public RegisterTeamDriverService (
            RegisterTeamDriverRepository registerTeamDriverRepository,
            DriverRepository driverRepository,
            TeamRepository teamRepository,
            SeasonRepository seasonRepository){
        this.registerTeamDriverRepository = registerTeamDriverRepository;
        this.driverRepository = driverRepository;
        this.teamRepository = teamRepository;
        this.seasonRepository = seasonRepository;
    }

    public Iterable<RegisterTeamDriver> getAllData() {
        return registerTeamDriverRepository.findAll();
    }

    /**
     * Add a new relationship between a Driver and a Team.
     * @param number
     * @param idDriver
     * @param idTeam
     */
    public String createNewRelationship(int number, int idDriver, int idTeam, int idSeason) {
        RegisterTeamDriver registerNew = new RegisterTeamDriver();
        registerNew.setRegisterTeamDriver_driver(driverRepository.findById(idDriver).get());
        registerNew.setRegisterTeamDriver_team(teamRepository.findById(idTeam).get());
        registerNew.setRegisterTeamDriver_season(seasonRepository.findById(idSeason).get());
        registerNew.setNumberDriver(number);
        registerTeamDriverRepository.save(registerNew);
        return "Saved";
    }
}
