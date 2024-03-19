package com.gaort.formulaOne.Country;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gaort.formulaOne.Driver.Driver;
import com.gaort.formulaOne.GrandPrix.GrandPrix;
import com.gaort.formulaOne.Team.Team;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Data public class Country{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCountry;

    @Column(length = 25)
    private String countryName;

    @JsonManagedReference
    @OneToMany(mappedBy = "driverCountry")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Driver> drivers;

    @JsonManagedReference
    @OneToMany(mappedBy = "teamCountry")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Team> teams;

    @JsonManagedReference
    @OneToMany(mappedBy = "countryGrandPrix")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private List<GrandPrix> grandPrixes;

}

