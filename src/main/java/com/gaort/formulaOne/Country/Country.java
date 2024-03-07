package com.gaort.formulaOne.Country;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gaort.formulaOne.Driver.Driver;
import com.gaort.formulaOne.Team.Team;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;


@Entity
@Data public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCountry;

    @Column(length = 25)
    private String countryName;

    @OneToMany(mappedBy = "driverCountry")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Driver> drivers;

    @OneToMany(mappedBy = "teamCountry")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Team> teams;

}

