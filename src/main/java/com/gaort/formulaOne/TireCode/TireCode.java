package com.gaort.formulaOne.TireCode;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gaort.formulaOne.GrandPrixSeason.GrandPrixSeason;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data public class TireCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTireCode;

    @Column(length = 2)
    private String code;

    @JsonManagedReference
    @OneToMany(mappedBy = "tireCodeGrandPrix")
    private List<GrandPrixSeason> grandPrixes;
}
