package com.thedayafter.designpattern;

import com.thedayafter.designpattern.factory.CarFactory;
import com.thedayafter.designpattern.factory.SUVFactory;
import com.thedayafter.designpattern.factory.TruckFactory;
import com.thedayafter.designpattern.factory.VehicleAbstractFactory;

import java.util.*;

public class App {
    static Vehicle[] vehicles = new Vehicle[25];
    static VehicleAbstractFactory vehicleAbstractFactory;
    public static void displayVehicles(Vehicle[] vehicles) {
        Iterator<Vehicle> vehicleIterator = Arrays.asList(vehicles).iterator();
        int i = 0;
        while ((vehicleIterator.hasNext())) {
            Vehicle vehicle = vehicleIterator.next();
            if (vehicle == null){
                System.out.println("We don't have any Vehicle number #"+(i+1));
            }
            else {
                try {
                    if (vehicle.getReserve() == null) {
                        System.out.println("Vehicle #"+(i+1) +" "+ vehicles[i].getMake() + " " + vehicles[i].getModel() + ", is not reserved");
                    } else {
                        System.out.println("Vehicle #"+(i+1) +" "+ vehicles[i].getMake() + " " + vehicles[i].getModel() +  ", is reserved");

                    }
                } catch (NullPointerException ne) {
                    System.out.println("Vehicle #"+(i+1) +" "+ vehicles[i].getMake() + " " + vehicles[i].getModel() + ", is reserved");

                }

            }
            i++;
        }
    }

    public static int findNext(int loc) {
        for (int x = 0; x < vehicles.length; x++) {
            x = loc ;
            return x;
        }
        return 0;
    }

    public static void main(String[] args) {

//        Vehicle x = new Car();
//        x = new VehicleDeco(new Insurance(x));

        String make, model, Company_name;
        int cmd, Selection, totalCost, vin, milePG, seats, bseats, rcap;



        Scanner input = new Scanner(System.in);
        boolean quit = false;

        int loc = 0;
        while (!quit) {
            System.out.println(" 1- Enter a new vehicle \n 2- Display all vehicles \n 3- Reserve a specific vehicle (by a specific company). \n 4- Display itemized list and total cost of all vehicles reserved for a specified company. \n 5- Quit");
            cmd = input.nextInt();

            if (cmd == 5) {
                quit = true;
            } else {
                switch (cmd) {
                    case 1:
                        System.out.print("Enter(1)Car, (2)SUV, (3)Truck:");
                        Selection = input.nextInt();

                        switch (Selection) {

                            case 1:
                                System.out.print("Enter the VIN of the car:");
                                vin = input.nextInt();
                                System.out.print("Enter the make of the car:");
                                make = input.next();
                                System.out.print("Enter the model of the car:");
                                model = input.next();
                                System.out.print("Enter the number of seats:");
                                seats = input.nextInt();
                                System.out.print("Enter the MPG:");
                                milePG = input.nextInt();
                                loc = findNext(loc);
                                vehicleAbstractFactory = new CarFactory(vin,milePG,make, model,seats );
                                vehicles[loc] = vehicleAbstractFactory.createVehicle();
                                break;


                            case 2:
                                System.out.print("Enter the VIN of the car:");
                                vin = input.nextInt();
                                System.out.print("Enter the make of the SUV:");
                                make = input.next();
                                System.out.print("Enter the model of the SUV:");
                                model = input.next();
                                System.out.print("Enter the number of seats:");
                                seats = input.nextInt();
                                System.out.print("Enter the MPG:");
                                milePG = input.nextInt();
                                loc = findNext(loc);
                                vehicleAbstractFactory = new SUVFactory(vin,milePG,make, model,seats );
                                vehicles[loc] = vehicleAbstractFactory.createVehicle();
                                break;

                            case 3:
                                System.out.print("Enter the VIN of the car:");
                                vin = input.nextInt();
                                System.out.print("Enter the make of the Truck:");
                                make = input.next();
                                System.out.print("Enter the model of the Truck:");
                                model = input.next();
                                System.out.print("Enter the number of seats:");
                                seats = input.nextInt();
                                System.out.print("Enter the MPG:");
                                milePG = input.nextInt();
                                loc = findNext(loc);
                                vehicleAbstractFactory = new TruckFactory(vin,milePG,make, model,seats);
                                vehicles[loc] = vehicleAbstractFactory.createVehicle();
                                break;
                        }

                    case 2:

                        displayVehicles(vehicles);

                        break;

                    case 3:
                        System.out.print("Enter the vin of the vehicle to reserve:");
                        vin = input.nextInt();
                        System.out.println("How many months, weeks or days would you like to rent for? \n");

                        System.out.println("Months(if none type 0)?");
                        int numMonths = input.nextInt();

                        System.out.println("Weeks(if none type 0)?");
                        int numWeeks = input.nextInt();

                        System.out.println("Days(if none type 0)?");
                        int numDays = input.nextInt();
                        //reserveVehicle(vin);// Supporting function

                    case 4:
                        System.out.print("Enter Company name: ");
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



}

