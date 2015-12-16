package com.thedayafter.designpattern;

/**
 * Created by waiti on 12/10/2015.
 */
public class Reservation {
    String companyName;
      int  numDays, numWeeks, numMonths;
      
    public  Reservation(String compName,  int  nDay,  int  nWeek,  int  nMonth){
          companyName = compName;
          numDays = nDay;
          numWeeks = nWeek;
          numMonths = nMonth;
              }
    public  int  getnumDays(){
          return  numDays;
    }
    public  int  getnumWeeks(){
          return  numWeeks;
    }
    public  int  getnumMonths(){
          return  numMonths;
    }
    public  String getcompanyName(){
          return  companyName;
    }
}
