package com.gaort.formulaOne.GrandPrix;

import com.gaort.formulaOne.Country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrandPrixService {

    private final GrandPrixRepository grandPrixRepository;
    private final CountryRepository countryRepository;

    @Autowired
    public GrandPrixService (GrandPrixRepository grandPrixRepository, CountryRepository countryRepository){
        this.grandPrixRepository = grandPrixRepository;
        this.countryRepository = countryRepository;
    }

    public Iterable<GrandPrix> getAllData() {
        return grandPrixRepository.findAll();
    }
    public String addNewGranPrix(String name, String circuitName, int idCountry) {
        GrandPrix newGrand = new GrandPrix();
        newGrand.setName(name);
        newGrand.setCircuitName(circuitName);
        newGrand.setCountryGrandPrix(countryRepository.findById(idCountry).get());
        grandPrixRepository.save(newGrand);
        return "Grand Prix saved succesfully";
    }
}
