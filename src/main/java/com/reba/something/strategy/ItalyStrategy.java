package com.reba.something.strategy;

import com.reba.something.pojo.Country;
import com.reba.something.pojo.TravelResTO;
import org.springframework.stereotype.Service;

@Service
public class ItalyStrategy implements CountryStrategy {

    @Override
    public Country country() {
        return Country.IT;
    }

    @Override
    public TravelResTO touristTravel() {
        return new TravelResTO("Coliseo", "Pisa", "Venecia", "Florencia");
    }

    @Override
    public TravelResTO studentTravel() {
        return new TravelResTO("Universidad Roma", "Pasantía Ferrero Roger");
    }

}