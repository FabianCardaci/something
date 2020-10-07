package com.reba.something.strategy;

import com.reba.something.pojo.Country;
import com.reba.something.pojo.TravelResTO;
import org.springframework.stereotype.Service;

@Service
public class ArgentinaStrategy implements CountryStrategy {

    @Override
    public Country country() {
        return Country.AR;
    }

    @Override
    public TravelResTO touristTravel() {
        return new TravelResTO("Obelisco", "Monumental", "Palermo", "Guerrin");
    }

    @Override
    public TravelResTO studentTravel() {
        return new TravelResTO("UTN", "Pasantía Reba", "Alojamiento compartido Caballito");
    }

}