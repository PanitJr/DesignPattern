package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/10/2015.
 */
public class Car extends Vehicle {
  double DailyCost;
   double WeeklyCost;
   double MonthlyCost;
   int NumSeats;
 
 
 public Car(int MPG, int seats, String mke, String mdl){
   super(MPG, mke,mdl);
   NumSeats = seats;
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
 public int getNumSeats(){
  return NumSeats;
 }
   
 public  void setDailyCost(){
  DailyCost = 24.95;
 }
 public  void setWeeklyCost(){
  WeeklyCost = 149.95;
 }
 public  void setMonthlyCost(){
  MonthlyCost = 514.95;
 }
   
  public  void setNumSeats(int seats){
  NumSeats = seats;
  }
}

