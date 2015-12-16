package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/16/2015.
 */
public class Truck extends Vehicle{
double dailyCost;
double weeklyCost;
double monthlyCost;
int numrCap;


public Truck(int MPG, int rCap, String mke, String mdl){
super(MPG,mke,mdl);
numrCap = rCap;
reserve = null;
}

    public Truck() {

    }

    public double getDailyCost(){
return dailyCost;
}
public double getWeeklyCost(){
return weeklyCost;
}
public double getMonthlyCost(){
return monthlyCost;
}

public void setDailyCost(){
dailyCost = 34.95;
}
public void setWeeklyCost(){
weeklyCost = 224.95;
}
public void setMonthlyCost(){
monthlyCost = 797.95;
}
public void setNumrCap(int rCap){
numrCap = rCap;
}
}

