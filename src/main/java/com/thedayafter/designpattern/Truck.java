package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/16/2015.
 */
public class Truck extends Vehicle{
double DailyCost;
double WeeklyCost;
double MonthlyCost;
int NumrCap;


public Truck(int MPG, int rCap, String mke, String mdl){
super(MPG,mke,mdl);
NumrCap = rCap;
reserve = null;
}
public double getDailyCost(){
return DailyCost;
}
public double getWeeklyCost(){
return WeeklyCost;
}
public double getMonthlyCost(){
return MonthlyCost;
}

public void setDailyCost(){
DailyCost = 34.95;
}
public void setWeeklyCost(){
WeeklyCost = 224.95;
}
public void setMonthlyCost(){
MonthlyCost = 797.95;
}
public void setNumrCap(int rCap){
NumrCap = rCap;
}
}

