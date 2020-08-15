
/**
 *
 * @author (Peter keres)
 * @version (1 9 2018)
 * f@ck cancer
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class tester
{
    public static void main(String[] args)
    {
        //vars i need
        String pCode, date,month,year;
        double price=0.0;
        boolean datecheck;
        int max=0;
        
        //objects
        Scanner scan = new Scanner(System.in);
        
        //list
        candy[] candylist = new candy[6];
        
        for (int i=0; i < 6; i++)
        {
            do
            {
                System.out.println("Please enter the product code");
                pCode = scan.next();
                
                System.out.println("please enter the expiration date");
                date = scan.next();
                try{
                System.out.println("please enter the price of the candy");
                price = scan.nextDouble();
            }
            catch(InputMismatchException e)
            {
                System.out.println("please enter in only numbers, now enter the price.");
            }
            
                if(pCode.substring(8,12).equals(date))
                {
                    datecheck = true;
                    System.out.println("great!, enter in next candy");
                }
                else
                {
                    System.out.println("the product codes and the date do not match, please try again");
                    datecheck = false;
                }
            }while(!datecheck);
            
            //splitting up date
            month = date.substring(0,2);
            year = date.substring(2,4);
            
            candylist[i] = new candy(pCode,price,month,year);
        }
        
        //printing out list
        for (int j=0; j<6;j++)
        {
            System.out.println("Candy" + (j+1) + " " + candylist[j]);
        }
        
        //finding the max
        for (int h =0; h < 6 ; h++)
        {
            for (int k = h+1; k < (candylist.length); k++)
            {
                if (candylist[h].compareTo(candylist[k]) == -1)
                    max = h;
                else if (candylist[h].compareTo(candylist[k]) == 1)
                    max = k;
                }
            }
            
        //printing out max
        System.out.println("the max price is candy " + max + " " + candylist[max]);
        
            
        
        
        
                
            
        
        
    }
   
}
