
/**
 * Write a description of class Average here.
 *
 * @author Peter Keres
 * @version jan 28 2018
 */
// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************

import java.util.Scanner;
public class Average
{
  public static void main(String[] args)
  {
    int val1, val2, val3;
    double average;
     Scanner scan = new Scanner(System.in) ;

    // get three values from user
    System.out.println("Please enter three integers and " +
                       "I will compute their average");

    // scan the first value and save it as val1
        val1 = scan.nextInt();

    // scan the second value and save it as val2
        val2 = scan.nextInt();

    // scan the third value and save it as val1
        val3 = scan.nextInt();
 
    //compute the average
        average = (val1 + val2 + val3) / 3;
    
    //print the average
        System.out.println("Your average is: " + average);
    
  }
}
