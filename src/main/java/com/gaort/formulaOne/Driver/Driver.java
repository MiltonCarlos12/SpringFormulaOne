package com.gaort.formulaOne.Driver;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gaort.formulaOne.Country.Country;
import com.gaort.formulaOne.RegisterTeamDriver.RegisterTeamDriver;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Data public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Getter Integer IdDriver;

    @Getter @Setter
    @Column(length = 45)
    private String nameDriver;
    @Getter @Setter
    @Column(length = 45)
    private String lastName;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(
            name = "driver_idCountry",
            foreignKey = @ForeignKey(name="FK_Country_idCountry"))
    private Country driverCountry;

    @OneToMany(mappedBy = "registerTeamDriver_driver")
    private List<RegisterTeamDriver> registerTeamDrivers;
}
