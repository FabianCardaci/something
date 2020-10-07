package com.reba.something.strategy;

import com.reba.something.pojo.Country;
import com.reba.something.pojo.TravelResTO;
import org.springframework.stereotype.Service;

@Service
public class BrazilStrategy implements CountryStrategy {

    @Override
    public Country country() {
        return Country.BR;
    }

    @Override
    public TravelResTO touristTravel() {
        return new TravelResTO("Maracana", "Cristo", "Pan de Azúcar", "Copacabana");
    }

    @Override
    public TravelResTO studentTravel() {
        return new TravelResTO("Universidad Río", "Pasantía Petrobras");
    }

}