
/**
 * Write a description of class guessingGame here.
 * 
 * @author (Peter Keres) 
 * @version (feb 23 2018)
 */

import java.util.Scanner;
import java.util.Random;

public class guessingGame
{
    public static void main(String[] args)
    {
        //setting up objects
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        
        //setting up variables
        int userNum = 0;
        String userAnswer = "";
        int cpuNum = 0;
        int cpuPoints = 0 ;
        int userPoints = 0 ;
        
        //asking user if they want to play frist time/welcome
        System.out.println("Welcome to the guessing game!");
        System.out.println("Would you like to play?");
        userAnswer = scan.next();
        
        
        
        // see if you can do another way without us9ing ignorcecase
        //if they give you yes then start game anything else quit
        while (userAnswer.equalsIgnoreCase("yes"))
        {
            //getting the user num
            System.out.println("Now give me a number of 2 digits you think the computer has picked");
            userNum = scan.nextInt();

            
            //getting the computer num
            cpuNum = rand.nextInt(90)+10;
            
            //seeing if they are the same, if so give 10 to the user else 10 to cpu
            if (cpuNum == userNum)
            {
                userPoints = userPoints + 10;
                System.out.println("Nice job you got it !");
            }
            else
            {
                cpuPoints = cpuPoints + 10;
                System.out.println("Not this time, try again");
            }
            
            
            //asking the user again if they want to play
            System.out.println("Would you like to play again?");
            userAnswer = scan.next();
            
        }
           
        // they are done playing now display scores and thank them.
        System.out.println("Thanks for playing! Here are the scores");
        System.out.println("The cpu got a total of " + cpuPoints + " points.");
        System.out.println("You got a total of " + userPoints + " points.");
        if (userPoints > cpuPoints)
            System.out.println("Congrats on beating the cpu!");
        else
            System.out.println("Looks like the cpu got the better of you this time.");
            
        
    }
}
