package com.reba.something.service;

import com.reba.something.pojo.Country;
import com.reba.something.pojo.TravelReqTO;
import com.reba.something.pojo.TravelResTO;
import com.reba.something.strategy.CountryStrategy;
import com.reba.something.visitor.StudentVisitor;
import com.reba.something.visitor.TouristVisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Service
public class TouristService {

    private Map<Country, CountryStrategy> strategiesByCountry;

    @Autowired
    private List<CountryStrategy> strategies;


    @PostConstruct
    public void init() {
        strategiesByCountry = strategies.stream().collect(toMap(CountryStrategy::country, it -> it));
    }


    public TravelResTO proceduralTravel(final TravelReqTO request) {
        switch (request.getCountry()) {
            case AR:
                return new TravelResTO("Obelisco", "Monumental", "Palermo", "Guerrin");
            case BR:
                return new TravelResTO("Maracana", "Cristo", "Pan de Azúcar", "Copacabana");
            case IT:
                return new TravelResTO("Coliseo", "Pisa", "Venecia", "Florencia");
            default:
                throw new IllegalStateException("Country not configured");
        }
    }


    public TravelResTO strategyTravel(final TravelReqTO request) {
        final CountryStrategy strategy = strategiesByCountry.get(request.getCountry());
        return strategy.touristTravel();
    }


    public TravelResTO visitorTravel(final TravelReqTO request) {
        final Country country = request.getCountry();
        final TouristVisitor visitor = new TouristVisitor();
        return country.accept(visitor);
    }

}