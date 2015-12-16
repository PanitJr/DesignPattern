package com.thedayafter.designpattern.Decorator;

import com.thedayafter.designpattern.Vehicle;

/**
 * Created by waiti on 12/16/2015.
 */
public class VehicleDeco extends Vehicle {

    protected Vehicle tempVehicle;
    public VehicleDeco(Vehicle newVehicle){

        tempVehicle = newVehicle;

        	    }

    @Override
    public double getDailyCost() {
        return tempVehicle.getDailyCost();
    }

    @Override
    public double getWeeklyCost() {
        return tempVehicle.getWeeklyCost();
    }

    @Override
    public double getMonthlyCost() {
        return tempVehicle.getMonthlyCost();
    }
}
