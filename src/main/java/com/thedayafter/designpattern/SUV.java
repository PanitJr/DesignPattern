package   com.thedayafter.designpattern;

/**
 *   Created   by   waiti   on   12/10/2015.
 */
public class SUV extends Vehicle {
    double dailyCost;
    double weeklyCost;
    double monthlyCost;
    int numbSeats;

    public SUV(int MPG, int bseats, String mke, String mdl){
        super(MPG, mke, mdl);
        numbSeats =   bseats;
        reserve   = null;
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

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public void setWeeklyCost(double weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public void setNumSeats(int numbSeats) {
        this.numbSeats = numbSeats;
    }
}
