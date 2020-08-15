
/**
 * Write a description of class Errors here.
 *
 * @author Peter Keres
 * @version jan 28 2018
 */
// File:     Errors.java
// Purpose:  A program with lots of syntax errors
//           Correct all of the errors (STUDY the program carefully!!)

import java.util.Scanner;

public class Errors
{
   public static void main (String[] args)
   {
       String Name;  // Name of the user 
       int number;
       int numSq;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter your name, please: ");
       Name = scan.next();

       System.out.print ("What is your favorite number?");
       number = scan.nextInt();

       numSq = number * number;

       System.out.println (Name + ", the square of your number is " + numSq);

}
}
