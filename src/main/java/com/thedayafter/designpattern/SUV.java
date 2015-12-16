package   com.thedayafter.designpattern;

/**
 *   Created   by   waiti   on   12/10/2015.
 */
public   class   SUV   extends Vehicle {
     double DailyCost;
     double WeeklyCost;
     double MonthlyCost;
        int NumbSeats;

public SUV(int MPG, int bseats,   String   mke,   String   mdl){
        super(MPG,   mke,mdl);
        NumbSeats   =   bseats;
        reserve   = null;
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

          public void setNumSeats(int bseats){
          NumbSeats   =   bseats;
        }
        }
