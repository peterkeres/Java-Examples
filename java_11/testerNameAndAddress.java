
/**
 * This is the tester class for the spring break assignment on arrays
 *
 * @author (Peter Keres)
 * @version (3 21 2018)
 * f@ck Cancer
 */

import java.util.Scanner;


public class testerNameAndAddress
{
    public static void main(String[] args)
    {
        //making scanner object
        Scanner scan = new Scanner(System.in);
        
        //making the array
        nameAndAddress[] myArray = new nameAndAddress[10];
        
        //getting the name for each part of the array
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = new nameAndAddress();
            System.out.println("Please enter the name of the " + (i +1) + "th person");
            myArray[i].setName(scan.next());
            
        }
        
        System.out.println("");
        System.out.println("");
        
        //displaying the name and zip of teh array
        System.out.println("Here is the list of names and zipcodes");
        for (int j=0; j < myArray.length; j++)
        {
            System.out.println(myArray[j]);
        }      
    }
}
