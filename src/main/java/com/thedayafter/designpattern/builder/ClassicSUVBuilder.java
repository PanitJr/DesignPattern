package com.thedayafter.designpattern.builder;

/**
 * Created by waiti on 12/16/2015.
 */
public class ClassicSUVBuilder extends SUVBuilder {
    @Override
    public void buildMPG() {
        suv.setMilePG(20);
    }

    @Override
    public void buildmke() {
        suv.setMake("Classic");
    }

    @Override
    public void buildmdl() {
        suv.setModel("007");
    }

    @Override
    public void buildReserve() {
        suv.setReserve(null);
    }

    @Override
    public void buildseats() {
        suv.setNumSeats(4);
    }
}
