
/**
 * this will hold the main for the assignment on inheritance work
 * 
 *
 * @author (Peter Keres)
 * @version (4 4 2018)
 * f@ck cancer
 */

import java.util.Scanner;


public class bikeShop
{
   //main
   public static void main(String[] args)
   {
       //variables
       int bikeType, gear;
       String color;
       double price;
       
       //objects
       Scanner scan = new Scanner(System.in);
       
       
       
       
       //greet the user / find out what bike they got 
       System.out.println(" Hello and welcome to the bike shop, answer the following questions so we can see what bike you bought");
       System.out.println("What type of bike did you buy, enter 1 for moution bike, 2 for tandem bike, 3 for a kids bike.");
       bikeType = scan.nextInt();
       
       
       //other informatoin about the bike
       System.out.println("what is the color of you bike?");
       color = scan.next();
       
       System.out.println("how many gears does it have?");
       gear = scan.nextInt();
       
       System.out.println("how much was your bike?");
       price = scan.nextDouble();
       
       
       //get information basid on what type bike they got
       if (bikeType == 1)   //this is for mtBike
       {
           //making vars i need 
           int shock;
           double tireThickness;
           
           //ask questions
           System.out.println("What is the hight of the shocks?");
           shock = scan.nextInt();
           
           System.out.println("What is the thickness of the tires?");
           tireThickness = scan.nextDouble();
           
           
           // making the object with all the fields
           mtBike bike1 = new mtBike(color,gear,price,shock,tireThickness);
           
           //printing out the bike
           System.out.println("");
           System.out.println("");
           
           System.out.println(bike1);
        }
       else if (bikeType == 2)  //this is for tandembike
       {
           //making vars i need
           int numSeats, numWheels;
           
           //asking qestions
           System.out.println("How many seats does the bike have?");
           numSeats = scan.nextInt();
           
           System.out.println("How many wheels does the bike have?");
           numWheels = scan.nextInt();
           
           
           //making the object
           tandemBike bike2 = new tandemBike(color,gear,price,numSeats,numWheels);
           
           //printing out to the user
           System.out.println("");
           System.out.println("");
           
           System.out.println(bike2);
        }
       else             //this is for a kidBike
       {
           //make the vars i need
           String trainingWheels;
           
           //asking the questions i need
           System.out.println("does the bike have training wheels?");
           trainingWheels = scan.next();
           
           //making the object
           
           if (trainingWheels.equalsIgnoreCase("true"))
           {
               System.out.println("");
               System.out.println("");
               kidBike bike3 = new kidBike(color,gear,price,true);
           }
           else
           {
               System.out.println("");
               System.out.println("");
               kidBike bike3 = new kidBike(color,gear,price,false);
            }
            
            
       }
        
    }
}

