package com.gaort.formulaOne.Season;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService {

    private final SeasonRepository seasonRepository;

    @Autowired
    public SeasonService (SeasonRepository seasonRepository){
        this.seasonRepository = seasonRepository;
    }

    public String addNewSeason(Season season) {
        seasonRepository.save(season);
        return "Saved Seasons perfectly";
    }

    public Iterable<Season> getAllData() {
        return seasonRepository.findAll();
    }
}
