package com.reba.something.visitor;

public interface CountryVisitor<T> {

    T visitArgentina();

    T visitBrazil();

    T visitItaly();

}