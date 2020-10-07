package com.reba.something.visitor;

import com.reba.something.pojo.TravelResTO;

public class TouristVisitor implements CountryVisitor<TravelResTO> {

    @Override
    public TravelResTO visitArgentina() {
        return new TravelResTO("Obelisco", "Monumental", "Palermo", "Guerrin");
    }

    @Override
    public TravelResTO visitBrazil() {
        return new TravelResTO("Maracana", "Cristo", "Pan de Azúcar", "Copacabana");
    }

    @Override
    public TravelResTO visitItaly() {
        return new TravelResTO("Coliseo", "Pisa", "Venecia", "Florencia");
    }

}