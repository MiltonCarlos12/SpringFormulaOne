package com.gaort.formulaOne.Season;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity

@Data public class Season {

    @Id
    private int idSeason;

    @Column(length = 45)
    private String name;

    private Date dateStart;

    private Date dateEnd;

    private int totalRaces;
}
