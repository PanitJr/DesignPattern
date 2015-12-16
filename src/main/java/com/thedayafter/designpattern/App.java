
package com.thedayafter.designpattern;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void displayVehicles(Vehicle[] vehicles){
        for (int x = 1; x <= 25; x++){
            if (isReserved(vehicles) == true){
                System.out.println("Vehicle " + x + ": " + vehicles[x - 1] + ", is currently reserved");
                }
            else{
                System.out.println("Vehicle " + x + ": " + vehicles[x - 1] + ", is not reserved");
                }
            }
        }

    public static int findNext(int loc){
        loc = 0;
        for (int x = 0; x <= 24; x++){
            x = loc + 1;
            return x;
            }
        return 0;
        }
    public static void main(String[] args){

        String Make, Model, Company_name;
        int cmd, Selection, total_cost, Vin, MilePG, seats, bseats, rcap;

        Vehicle[] vehicles = new Vehicle[25];

        Scanner input = new Scanner(System.in);
        boolean quit = false;

        int loc = 0;
        while(!quit){
            System.out.println(" 1- Enter a new vehicle \n 2- Display all vehicles \n 3- Reserve a specific vehicle (by a specific company). \n 4- Display itemized list and total cost of all vehicles reserved for a specified company. \n 5- Quit");
            cmd = input.nextInt();

            if(cmd==5){
                quit = true;}
            else{
                switch(cmd){
                    case 1: System.out.print("Enter(1)Car, (2)SUV, (3)Truck:");
                    Selection = input.nextInt();

                    switch(Selection){

                        case 1: System.out.print("Enter the make of the car:");
                        Make = input.next();
                        System.out.print("Enter the model of the car:");
                        Model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        MilePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new Car(MilePG, seats, Make, Model);
                        break;


                        case 2: System.out.print("Enter the make of the SUV:");
                        Make = input.next();
                        System.out.print("Enter the model of the SUV:");
                        Model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        MilePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new SUV(MilePG, seats, Make, Model);
                        break;

                        case 3: System.out.print("Enter the make of the Truck:");
                        Make = input.next();
                        System.out.print("Enter the model of the Truck:");
                        Model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        MilePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new Truck(MilePG, seats, Make, Model);
                        break;
                        }

                    case 2:

                        displayVehicles(vehicles);

                    break;

                    case 3: System.out.print("Enter the vin of the vehicle to reserve:");
                    Vin = input.nextInt();
                    System.out.println("How many months, weeks or days would you like to rent for? \n");

                    System.out.println("Months(if none type 0)?");
                    int numMonths = input.nextInt();

                    System.out.println("Weeks(if none type 0)?");
                    int numWeeks = input.nextInt();

                    System.out.println("Days(if none type 0)?");
                    int numDays = input.nextInt();
                    //reserveVehicle(Vin);// Supporting function

                    case 4: System.out.print("Enter Company name: ");
                    String compName = input.next();


                    //double calcRentalCost= (Car.DailyCost) + (numWeeks * Car.getWeeklyCost()) + (numMonths * Car.getMonthlyCost());
                    //total_cost = calcRentalCost;

                    //displayVehicles(compName);
                    //System.out.println("Total cost for all vehicles: $" + total_cost);                               
                    }
                }
            }
        System.out.println("Goodbye");
        }
    public static boolean isReserved(Vehicle[] vehicles){
        for (int x = 0; x <= vehicles.length; x++){
            if ((vehicles[x].reserve!=null)){
                return true;
                }
            else{
                return false;
                }
            }
        return false;
        }
    }

