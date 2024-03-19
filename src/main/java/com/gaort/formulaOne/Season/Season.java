package com.gaort.formulaOne.Season;

import com.gaort.formulaOne.RegisterTeamDriver.RegisterTeamDriver;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Data public class Season {

    @Id
    private int idSeason;

    @Column(length = 45)
    private String name;

    private Date dateStart;

    private Date dateEnd;

    private int totalRaces;

    @OneToMany(mappedBy = "registerTeamDriver_season")
    private List<RegisterTeamDriver> registerTeamDrivers;

    public Season(int idSeason, String name, Date dateStart, Date dateEnd, int totalRaces) {
        this.idSeason = idSeason;
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.totalRaces = totalRaces;
    }
}
