
/**
 * Write a description of class username here.
 *
 * @author (Peter Keres)
 * @version (2/17/18)
 * f#ck cancer
 */

import java.util.Scanner;
import java.util.Random;

public class username
{
    public static void main(String[] args)
    {
        //setting up objects
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        
        //setting up variables
        String firstFull= "";
        String lastFull= "";
        String userName = "";
        int num;
        
        
        //getting input for f and l name 
        System.out.println("Please enter your first name:");
        firstFull = scan.next();
        
        System.out.println("Please enter your last name:");
        lastFull = scan.next();
        
        
        //splitting up to get the username
        userName = firstFull.substring(0,1);
        userName = userName.concat((lastFull.substring(0,3)));
        System.out.println(firstFull);
        
        //getting the random num and then adding it on 
        num = rand.nextInt(50)+10;
        userName = userName + num;
        
        //printing it out to the user
        System.out.println("Your new username is : " + userName);
        
        
    }
}
