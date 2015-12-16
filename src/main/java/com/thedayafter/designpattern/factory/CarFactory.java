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
    private Reservation reserve;
    private int numSeats;


    public Vehicle createVehicle() {
        Car c = new Car(milePG,numSeats,make,model);
        c.setDailyCost();
        c.setWeeklyCost();
        c.setMonthlyCost();
        return c;
    }

}
