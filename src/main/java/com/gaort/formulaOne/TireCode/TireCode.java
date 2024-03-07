package com.gaort.formulaOne.TireCode;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data public class TireCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTireCode;

    @Column(length = 2)
    private String code;
}
