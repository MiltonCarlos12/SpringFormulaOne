package com.gaort.formulaOne.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public String saveNewCountry(Country country) {
        countryRepository.save(country);
        return "Saved succesfully";
    }

    public Iterable<Country> getAllData() {
        return countryRepository.findAll();
    }

    public Country getById(int idCountry) {
        Country contryNew = countryRepository.findById(idCountry).get();
        return contryNew;
    }
}
