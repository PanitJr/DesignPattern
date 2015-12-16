package com.thedayafter.designpattern.builder;

/**
 * Created by waiti on 12/16/2015.
 */
public class ClassicCarBuilder extends CarBuilder {
    @Override
    public void buildMPG() {
        car.setMilePG(20);
    }

    @Override
    public void buildmke() {
        car.setMake("Classic");
    }

    @Override
    public void buildmdl() {
        car.setModel("007");
    }

    @Override
    public void buildReserve() {
        car.setReserve(null);
    }

    @Override
    public void buildseats() {
        car.setNumSeats(4);
    }
}
