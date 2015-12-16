package com.thedayafter.designpattern.factory;

import com.thedayafter.designpattern.SUV;
import com.thedayafter.designpattern.Vehicle;

/**
 * Created by Chertpong on 16/12/2558.
 */
public class SUVFactory implements VehicleAbstractFactory {
    private int vin;
    private int milePG;
    private String make;
    private String model;
    private int numberOfSeats;

    public SUVFactory(int vin, int milePG, String make, String model, int numberOfSeats) {
        this.vin = vin;
        this.milePG = milePG;
        this.make = make;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public Vehicle createVehicle() {
        SUV s = new SUV(milePG, numberOfSeats, make, model);
        return s;
    }
}
