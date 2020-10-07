package com.reba.something.strategy;

import com.reba.something.pojo.Country;
import com.reba.something.pojo.TravelResTO;

public interface CountryStrategy {

    Country country();

    TravelResTO touristTravel();

    TravelResTO studentTravel();

}