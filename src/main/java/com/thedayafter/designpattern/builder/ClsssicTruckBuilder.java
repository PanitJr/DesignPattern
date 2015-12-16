package com.thedayafter.designpattern.builder;

/**
 * Created by waiti on 12/16/2015.
 */
public class ClsssicTruckBuilder extends TruckBuilder{
    @Override
    public void buildMPG() {
        truck.setMilePG(20);
    }

    @Override
    public void buildmke() {
        truck.setMake("Classic");
    }

    @Override
    public void buildmdl() {
        truck.setModel("007");
    }

    @Override
    public void buildReserve() {
        truck.setReserve(null);
    }

    @Override
    public void buildseats() {
        truck.setNumrCap(4);
    }
}
