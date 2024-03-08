package com.gaort.formulaOne.GrandPrixSeason;

import com.gaort.formulaOne.GrandPrix.GrandPrix;
import com.gaort.formulaOne.GrandPrix.GrandPrixRepository;
import com.gaort.formulaOne.Season.SeasonRepository;
import com.gaort.formulaOne.TireCode.TireCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrandPrixSeasonService {

    private final GrandPrixSeasonRepository grandPrixSeasonRepository;
    private final GrandPrixRepository grandPrixRepository;
    private final SeasonRepository seasonRepository;
    private final TireCodeRepository tireCodeRepository;

    @Autowired
    public GrandPrixSeasonService (
            GrandPrixSeasonRepository grandPrixSeasonRepository,
            GrandPrixRepository grandPrixRepository,
            SeasonRepository seasonRepository,
            TireCodeRepository tireCodeRepository){
        this.grandPrixSeasonRepository = grandPrixSeasonRepository;
        this.grandPrixRepository = grandPrixRepository;
        this.seasonRepository = seasonRepository;
        this.tireCodeRepository = tireCodeRepository;
    }

    public String addNewGrandPrixSeason(int idGrandPrix,int idSeason, int idTireCode ) {
        GrandPrixSeason grandSeason = new GrandPrixSeason();
        grandSeason.setGrandPrix_grandPrixSason(grandPrixRepository.findById(idGrandPrix).get());
        grandSeason.setSeasonGrandPrixSeason(seasonRepository.findById(idSeason).get());
        grandSeason.setTireCodeGrandPrix(tireCodeRepository.findById(idTireCode).get());
        grandPrixSeasonRepository.save(grandSeason);
        return "New Relationship has been created between the Grand Prix and a the Season.";
    }

    public Iterable<GrandPrixSeason> getAllData() {
        return grandPrixSeasonRepository.findAll();
    }
}
