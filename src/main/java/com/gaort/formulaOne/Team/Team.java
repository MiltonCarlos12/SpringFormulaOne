package com.gaort.formulaOne.Team;

import com.gaort.formulaOne.Country.Country;
import com.gaort.formulaOne.RegisterTeamDriver.RegisterTeamDriver;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTeam;

    @Column(length = 45)
    private String nameCountry;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "team_idCountry",
            foreignKey = @ForeignKey(name = "fk_team_idCountry")
    )
    private Country teamCountry;

    @OneToMany(mappedBy = "registerTeamDriver_team")
    private List<RegisterTeamDriver> registerTeamDrivers;
}
