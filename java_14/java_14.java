/*
* Peter Keres
* quiz 23
*
* main class that acts as a user interface to see the truck data
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class java_14 {

    public static void main(String[] args) {
        Vehicle[] trucks = new Truck[3];
        int user;

        for (int userTruck = 0; userTruck < 3; userTruck++) {
            System.out.println("Please enter in the data for truck " + (userTruck+1) );
            trucks[userTruck] = makeVehicle();
        }

        do{
            printMenu(trucks);
            user = userMenuChoice();

            switch (user){
                case 1:
                    trucks[0].print();
                    break;
                case 2:
                    trucks[1].print();
                    break;
                case 3:
                    trucks[2].print();
                    break;
            }

        }while(user != 4);

        System.out.println("EXITING PROGRAM");
    }

    /**
     * just prints out the main menu
     * @param trucks; an array of the trucks in the system
     */
    private static void printMenu(Vehicle[] trucks){
        for (int truck = 0; truck < 3; truck++) {
            System.out.println((truck+1) + "\tprint " + trucks[truck].getModel() + " information");
        }
        System.out.println("4\tQuit");
    }

    /**
     * grabs user input from the menu and makes sure its valid
     * @return the users choice from the menu
     */
    private static int userMenuChoice(){
        Scanner scan = new Scanner(System.in);
        int user = 0;
        boolean pass;

        do {
            try{
                System.out.print("CHOICE:");
                user = scan.nextInt();
                pass = true;
                if (user > 4){
                    System.out.println("Not a valid choice, try again");
                    pass = false;
                }
            }catch (InputMismatchException e){
                System.out.print("Nto a valid choice, try again");
                pass = false;
            }
        }while (!pass);

        return user;
    }

    /**
     * makes a vehicle object based on user input
     * @return a truck object created by user
     */
    private static Vehicle makeVehicle() {
        Scanner scan = new Scanner(System.in);
        boolean pass;
        int year = 0;
        double tonnage = 0.0;


        System.out.print("Please enter in the make of the vehicle");
        String make = scan.next();

        System.out.print("Please enter in the vehicles model");
        String model = scan.next();

        do {
            System.out.print("Please enter the year of the vehicle");
            try {
                year = scan.nextInt();
                pass = true;
            }
            catch (InputMismatchException e){
                System.out.println("ERROR!!! please enter in only numbers thanks!");
                scan.next();
                pass = false;
            }
        }while(!pass);

        do {
            System.out.print("What is the tonnage on this vehicle");
            try{
                tonnage = scan.nextDouble();
                pass = true;
            }
            catch (InputMismatchException e) {
                System.out.println("ERROR!!! please enter in only numbers in the format of #.#");
                scan.next();
                pass = false;
            }
        }while(!pass);

        return  new Truck(make,model,year,tonnage);
    }


}
