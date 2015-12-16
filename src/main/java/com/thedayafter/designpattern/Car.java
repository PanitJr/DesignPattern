package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/10/2015.
 */
public class Car extends Vehicle {
 double dailyCost;
 double weeklyCost;
 double monthlyCost;
 int numSeats;


 public Car(int MPG, int seats, String mke, String mdl){
  super(MPG, mke,mdl);
  numSeats = seats;
 }

 public Car() {

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
 public int getNumSeats(){
  return numSeats;
 }

 public  void setDailyCost(){
  dailyCost = 24.95;
 }
 public  void setWeeklyCost(){
  weeklyCost = 149.95;
 }
 public  void setMonthlyCost(){
  monthlyCost = 514.95;
 }

 public  void setNumSeats(int seats){
  numSeats = seats;
 }
}

