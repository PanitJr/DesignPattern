package com.thedayafter.designpattern.builder;

import com.thedayafter.designpattern.Truck;

/**
 * Created by waiti on 12/16/2015.
 */
public abstract class TruckBuilder {
    Truck truck;

    public Truck getTruck() { return truck; }
    public void createNewTruck() { truck = new Truck(); }

    public abstract void buildMPG();
    public abstract void buildmke();
    public abstract void buildmdl();
    public abstract void buildReserve();
    public abstract void buildseats();
}
