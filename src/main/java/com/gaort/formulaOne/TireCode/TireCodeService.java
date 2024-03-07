package com.gaort.formulaOne.TireCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TireCodeService {

    private final TireCodeRepository tireCodeRepository;

    @Autowired
    public TireCodeService (TireCodeRepository tireCodeRepository){
        this.tireCodeRepository = tireCodeRepository;
    }

    public String addNewTireCode(String nameCode) {
        TireCode tirecode = new TireCode();
        tirecode.setCode(nameCode);
        tireCodeRepository.save(tirecode);
        return "Tire Code has been saved correctly";
    }

    public Iterable<TireCode> getAllData() {
        return tireCodeRepository.findAll();
    }
}
