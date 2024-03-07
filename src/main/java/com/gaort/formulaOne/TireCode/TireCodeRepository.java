package com.gaort.formulaOne.TireCode;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TireCodeRepository extends CrudRepository<TireCode, Integer> {
}
