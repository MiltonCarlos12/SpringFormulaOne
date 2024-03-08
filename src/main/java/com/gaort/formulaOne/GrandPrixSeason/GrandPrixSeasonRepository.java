package com.gaort.formulaOne.GrandPrixSeason;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrandPrixSeasonRepository extends CrudRepository<GrandPrixSeason, Integer> {
}
