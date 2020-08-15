
/**
 * this is the class i made for the spring break assignment on arrays
 *
 * @author (Peter Keres)
 * @version (3 21 2018)
 * f@ck cancer
 */

import java.util.Random;


public class nameAndAddress
{
   //random object
   Random rand = new Random();
   
   
   //making variables
   private String name;
   private int zipCode;
   
   //giving variables default values
   public nameAndAddress()
   {
       name = "";
       zipCode = rand.nextInt(70000) + 20000;
   }
    
   
   //assigning the name 
   public void setName(String cName)
   {
       name = cName;
    }
    
    
   //writing getters for the name and zipcode
   public String getName()
   {
       return name;
    }
    
   public int getZipCode()
   {
       return zipCode;
    }
    
    
   // writing the toString
   public String toString()
   {
       String x;
       x = name + "\t" + zipCode;
       return x;
   }
    
}
