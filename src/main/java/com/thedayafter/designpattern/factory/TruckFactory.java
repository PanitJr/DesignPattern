package com.thedayafter.designpattern.factory;

import com.thedayafter.designpattern.Reservation;
import com.thedayafter.designpattern.Truck;
import com.thedayafter.designpattern.Vehicle;

/**
 * Created by Chertpong on 16/12/2558.
 */
public class TruckFactory implements VehicleAbstractFactory{
    private int vin;
    private int milePG;
    private String make;
    private String model;
    private int numberOfCap;

    public TruckFactory(int vin, int milePG, String make, String model, int numberOfCap) {
        this.vin = vin;
        this.milePG = milePG;
        this.make = make;
        this.model = model;
        this.numberOfCap = numberOfCap;
    }

    public Vehicle createVehicle() {
        Truck t = new Truck(milePG,numberOfCap,make,model);
        t.setDailyCost();
        t.setWeeklyCost();
        t.setMonthlyCost();
        return t;
    }

}
