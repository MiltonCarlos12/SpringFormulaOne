package com.gaort.formulaOne.Driver;

import com.gaort.formulaOne.Views.DriversByYear;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends CrudRepository<Driver,Integer> {

    @Query(
            "select new com.gaort.formulaOne.Views.DriversByYear(d.nameDriver, d.lastName, rtd.numberDriver, t.nameTeam, c.countryName) " +
                    "from RegisterTeamDriver rtd " +
                    "inner join rtd.registerTeamDriver_driver d " +
                    "inner join rtd.registerTeamDriver_team t " +
                    "inner join rtd.registerTeamDriver_season s " +
                    "inner join d.driverCountry c where idSeason = ?#{[0]}"
    )
    List<DriversByYear> getDriversByYear(int year);
}
