package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/10/2015.
 */
public abstract class Vehicle {
    int Vin,MilePG;
    String Make, Model;
    Reservation reserve;
    public Vehicle(int MPG, String mke, String mdl){
        Make = mke;
        Model = mdl;
        MilePG = MPG;
        reserve = null;
    }
    
    public int getVin(){
        return Vin;
    }
    public int getMilePG(){
        return MilePG;
    }
    public String getMake(){
        return Make;
    }
    public String getModel(){
        return Model;
    }
     

    public abstract double getDailyCost();
    public abstract double getWeeklyCost();
    public abstract double getMonthlyCost();
     
    public void setVin(int vn){
        Vin = vn;
    }
    public void setMilePG(int MPG){
        MilePG = MPG;
    }
    public void setMake(String mke){
        Make = mke;
    }
    public void setModel(String mdl){
        Model = mdl;
    }
     
    public void createReservation(String CompName, int numDays, int numWeeks, int numMonths){
           reserve = new Reservation(CompName,numDays, numWeeks, numMonths);
    }
     
    public boolean isReserved(Vehicle[] vehicles, Reservation[] reserve){
        return !(reserve == null);
    }
     
    public String toString(){  
        if (reserve == null){
            return getMake() + " " + getModel() + " " + getVin() + "Is not reserved";}
        else{
            return getMake() + " " + getModel() + " " + getVin() + "Is reserved";}
    }

    public Reservation getReserve() {
        return reserve;
    }

    public void setReserve(Reservation reserve) {
        this.reserve = reserve;
    }
    //double calcRentalCost = (Car.DailyCost) + (numWeeks * Car.getWeeklyCost()) + (numMonths * Car.getMonthlyCost());
}

