package com.thedayafter.designpattern.builder;

import com.thedayafter.designpattern.Car;

/**
 * Created by waiti on 12/16/2015.
 */
public abstract class CarBuilder {
    public Car car;

    public Car getCar() { return car; }
    public void createNewCar() { car = new Car(); }

    public abstract void buildMPG();
    public abstract void buildmke();
    public abstract void buildmdl();
    public abstract void buildReserve();
    public abstract void buildseats();
}
