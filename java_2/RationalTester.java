
/**
 * this is the tester class for lab 7 that uses interfaces
 *
 * @author (Peter Keres)
 * @version (4 19 2018)
 */

public class RationalTester
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      RationalNumber r1 = new RationalNumber (6, 8);
      RationalNumber r2 = new RationalNumber (1, 3);
      RationalNumber r3;

      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);
      
      //testing combine method
      r3 = r1.combine(r2);
      
      //printing out the check
      System.out.println("The combined Rational number is: " + r3);
      
      //seeing which number is bigger
      if (r1.compareTo(r2) == 1)
        System.out.println(r2 + " is the bigger number.");
      else if (r1.compareTo(r2) == -1)
        System.out.println(r1 + " is the bigger number.");
      else
        System.out.println(r2 + " and " + r1 + " are the same number.");
       
      

   }
}
