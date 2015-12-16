package com.thedayafter.designpattern.Decorator;

import com.thedayafter.designpattern.Vehicle;

/**
 * Created by waiti on 12/16/2015.
 */
public class Insurance extends VehicleDeco{
    public Insurance(Vehicle newVehicle){
        super(newVehicle);
    }
    @Override
    public double getDailyCost() {
        return tempVehicle.getDailyCost()+10;
    }

    @Override
    public double getWeeklyCost() {
        return tempVehicle.getWeeklyCost()+50;
    }

    @Override
    public double getMonthlyCost() {
        return tempVehicle.getMonthlyCost()+100;
    }
}
