package com.gaort.formulaOne.Team;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gaort.formulaOne.Country.Country;
import com.gaort.formulaOne.RegisterTeamDriver.RegisterTeamDriver;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;


@Entity
@Data public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTeam;

    @Column(length = 45)
    private String nameTeam;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(
            name = "team_idCountry",
            foreignKey = @ForeignKey(name = "fk_team_idCountry")
    )
    private Country teamCountry;

    @JsonManagedReference
    @OneToMany(mappedBy = "registerTeamDriver_team")
    private List<RegisterTeamDriver> registerTeamDrivers;
}
