
/**
 * Write a description of class GaussSum here.
 *
 * @author (Peter Keres)
 * @version (2/2/2018)
 */
import java.util.Scanner;
public class GaussSum
{
public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int sum = 0;
      int i = 1;
      int n = 100;
      int user = 1;
      
      // greeting the user
      System.out.println("Hello! I am an addition calculator.");
      System.out.println("I will calculate the sum of any set of nubmer you enter.");
      
      //to bounce out when 0 is hit
      while (user != 0)
      {
          System.out.println("Enter any number you want between 1 and 100. Enter 0 to stop.");
          user = scan.nextInt();
          
          //to get in the range 100-0
          while (user > 100 || user < 0)
          {
              System.out.println("That was no in the range, please try again");
              user = scan.nextInt();
          }
          
          if (user != 0)
          {
             sum = (sum + user);
          }
      }
      System.out.println("The sum of 1 + 2 + ... + " + n + " is " + sum);
   }    
   
}
