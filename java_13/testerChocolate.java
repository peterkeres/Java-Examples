
/**
 * this is the tester class for the classwork 17
 *
 * @author (Peter Keres)
 * @version (4 18 2018)
 * f@ck cancer
 */

import java.util.Random;

public class testerChocolate
{
    public static void main(String[] args)
    {
     
        //any vars i need
        Chocolate tmp;
        
        //making the array of 5 chocolate classes
        Chocolate[] list1 = new Chocolate[5];
        
        //objects
        Random rand = new Random();
        
        //filling the array
        list1[0] = new Chocolate("kitkat",rand.nextInt(19)+1);
        list1[1] = new Chocolate("Snickers", rand.nextInt(19)+1);
        list1[2] = new Chocolate("PayDay", rand.nextInt(19)+1);
        list1[3] = new Chocolate("Crunch", rand.nextInt(19)+1);
        list1[4] = new Chocolate("Moon pie", rand.nextInt(19)+1);
        
        //figuring out the new order of objects
        for (int i=0; i < 5; i++)
        {
            for (int j=i+1;j < 5; j++)
            {
                if (list1[i].compareTo(list1[j]) == 1)  //j is bigger then i
                {
                }
                else if (list1[i].compareTo(list1[j]) == -1)
                {
                    tmp = list1[j];
                    list1[j] = list1[i];
                    list1[i] = tmp;
                }
                else
                {
                    tmp = list1[j];
                    list1[j] = list1[i+1];
                    list1[i+1] = tmp;
                }
            }
        }
                    
        
        //printing out the final list
        System.out.println("Here is the order of the list");
        
        for (int k=0; k<5;k++)
        {
            System.out.println("Name: " + list1[k].getName() + ", Quantity: " + list1[k].getQuantity());
        }
                 
                    
                    
        
        
    }
    
    
}
