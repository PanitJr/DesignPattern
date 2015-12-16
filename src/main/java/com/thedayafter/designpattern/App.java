package com.thedayafter.designpattern;
import java.util.*;

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

        String make, model, Company_name;
        int cmd, Selection, totalCost, vin, milePG, seats, bseats, rcap;

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
                        make = input.next();
                        System.out.print("Enter the model of the car:");
                        model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        milePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new Car(milePG, seats, make, model);
                        break;


                        case 2: System.out.print("Enter the make of the SUV:");
                        make = input.next();
                        System.out.print("Enter the model of the SUV:");
                        model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        milePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new SUV(milePG, seats, make, model);
                        break;

                        case 3: System.out.print("Enter the make of the Truck:");
                        make = input.next();
                        System.out.print("Enter the model of the Truck:");
                        model = input.next();
                        System.out.print("Enter the number of seats:");
                        seats = input.nextInt();
                        System.out.print("Enter the MPG:");
                        milePG = input.nextInt();
                        loc = findNext(loc);
                        vehicles[loc] = new Truck(milePG, seats, make, model);
                        break;
                        }

                    case 2:

                        displayVehicles(vehicles);

                    break;

                    case 3: System.out.print("Enter the vin of the vehicle to reserve:");
                    vin = input.nextInt();
                    System.out.println("How many months, weeks or days would you like to rent for? \n");

                    System.out.println("Months(if none type 0)?");
                    int numMonths = input.nextInt();

                    System.out.println("Weeks(if none type 0)?");
                    int numWeeks = input.nextInt();

                    System.out.println("Days(if none type 0)?");
                    int numDays = input.nextInt();
                    //reserveVehicle(vin);// Supporting function

                    case 4: System.out.print("Enter Company name: ");
                    String compName = input.next();


                    //double calcRentalCost= (Car.dailyCost) + (numWeeks * Car.getWeeklyCost()) + (numMonths * Car.getMonthlyCost());
                    //totalCost = calcRentalCost;

                    //displayVehicles(compName);
                    //System.out.println("Total cost for all vehicles: $" + totalCost);                               
                    }
                }
            }
        System.out.println("Goodbye");
        }
    public static boolean isReserved(Vehicle[] vehicles){
        for (int x = 0; x <= vehicles.length; x++) {
            try {
                if ((vehicles[x].reserve != null)) {
                    return true;
                } else {
                    return false;
                }
            } catch (NullPointerException ne) {
                return false;
            }
        }

        return false;
        }
    }

