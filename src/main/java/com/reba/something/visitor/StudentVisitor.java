package com.reba.something.visitor;

import com.reba.something.pojo.TravelResTO;

public class StudentVisitor implements CountryVisitor<TravelResTO> {

    @Override
    public TravelResTO visitArgentina() {
        return new TravelResTO("UTN", "Pasantía Reba", "Alojamiento compartido Caballito");
    }

    @Override
    public TravelResTO visitBrazil() {
        return new TravelResTO("Universidad Río", "Pasantía Petrobras");
    }

    @Override
    public TravelResTO visitItaly() {
        return new TravelResTO("Coliseo", "Pisa", "Venecia", "Florencia");
    }

}
