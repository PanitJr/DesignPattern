package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/10/2015.
 */
public abstract class Vehicle {
    int vin;
    int milePG;
    String make;
    String model;
    Reservation reserve;

    public Vehicle(int MPG, String mke, String mdl){
        make = mke;
        model = mdl;
        milePG = MPG;
        reserve = null;
    }

    public Vehicle() {

    }

    public int getVin(){
        return vin;
    }
    public int getMilePG(){
        return milePG;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
     

    public abstract double getDailyCost();
    public abstract double getWeeklyCost();
    public abstract double getMonthlyCost();
     
    public void setVin(int vn){
        vin = vn;
    }
    public void setMilePG(int MPG){
        milePG = MPG;
    }
    public void setMake(String mke){
        make = mke;
    }
    public void setModel(String mdl){
        model = mdl;
    }
     
    public void createReservation(String CompName, int numDays, int numWeeks, int numMonths){
           reserve = new Reservation(CompName,numDays, numWeeks, numMonths);
    }
     
    public boolean isReserved(Vehicle[] vehicles, Reservation[] reserve){
        return !(reserve == null);
    }
     
    public String toString(){  
        if (reserve == null){
            return getMake() + " " + getModel() + " " + getVin() + "is not reserved";}
        else{
            return getMake() + " " + getModel() + " " + getVin() + "is reserved";}
    }

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
    //double calcRentalCost = (Car.dailyCost) + (numWeeks * Car.getWeeklyCost()) + (numMonths * Car.getMonthlyCost());
}

