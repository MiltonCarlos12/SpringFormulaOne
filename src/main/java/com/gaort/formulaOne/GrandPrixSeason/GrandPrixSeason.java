package com.gaort.formulaOne.GrandPrixSeason;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gaort.formulaOne.GrandPrix.GrandPrix;
import com.gaort.formulaOne.Season.Season;
import com.gaort.formulaOne.TireCode.TireCode;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data public class GrandPrixSeason {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idGrandPrixSeason;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(
            name = "GrandPrix_idGrandPrix",
            referencedColumnName = "idGrandPrix",
            foreignKey = @ForeignKey(name = "fK_grandPrixSeason_grandprix")

    )
    private GrandPrix grandPrix_grandPrixSason;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(
            name="Season_idSeason",
            referencedColumnName = "idSeason",
            foreignKey = @ForeignKey(name = "fK_Season_grandPrixSeason")
    )
    private Season seasonGrandPrixSeason;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "Tire_idTire",
            referencedColumnName = "idTireCode",
            foreignKey = @ForeignKey(name = "fK_tireCode_GrandPrix")
    )
    private TireCode tireCodeGrandPrix;
}
