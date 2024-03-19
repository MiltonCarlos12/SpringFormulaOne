package com.gaort.formulaOne.GrandPrix;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gaort.formulaOne.Country.Country;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data public class GrandPrix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrandPrix;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String circuitName;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(
            name = "country_idCountry",
            referencedColumnName = "idCountry",
            foreignKey = @ForeignKey(name = "fk_grandPrix_country")
    )
    private Country countryGrandPrix;

}
