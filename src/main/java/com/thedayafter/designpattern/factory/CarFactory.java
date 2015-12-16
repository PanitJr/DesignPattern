package com.thedayafter.designpattern.factory;

import com.thedayafter.designpattern.Car;
import com.thedayafter.designpattern.Reservation;
import com.thedayafter.designpattern.Vehicle;

/**
 * Created by Chertpong on 16/12/2558.
 */
public class CarFactory implements VehicleAbstractFactory{
    private int vin;
    private int milePG;
    private String make;
    private String model;
    private int numSeats;

    public CarFactory(int vin, int milePG, String make, String model, int numSeats) {
        this.vin = vin;
        this.milePG = milePG;
        this.make = make;
        this.model = model;
        this.numSeats = numSeats;
    }

    public Vehicle createVehicle() {
        Car c = new Car(milePG,numSeats,make,model);
        c.setDailyCost();
        c.setWeeklyCost();
        c.setMonthlyCost();
        return c;
    }

}
