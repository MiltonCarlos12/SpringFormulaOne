package com.gaort.formulaOne.RegisterTeamDriver;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gaort.formulaOne.Driver.Driver;
import com.gaort.formulaOne.Team.Team;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data public class RegisterTeamDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRegisterTeamDriver;

    private int numberDriver;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "driver_idDriver",
            foreignKey = @ForeignKey(name = "fk_registerTeamDriver_idDriver")
    )
    private Driver registerTeamDriver_driver;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(
            name = "team_idTeam",
            foreignKey = @ForeignKey(name = "fk_registerTeamDriver_idTeam")
    )
    private Team registerTeamDriver_team;

}
