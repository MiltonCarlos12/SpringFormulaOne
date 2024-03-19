package com.gaort.formulaOne.Views;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DriversByYear {

    @Getter @Setter
    private String nameDriver;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int number;

    @Getter @Setter
    private String nameTeam;

    @Getter @Setter
    private String countryName;

}
