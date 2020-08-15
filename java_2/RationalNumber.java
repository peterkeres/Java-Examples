//****************************************************************
//  RationalNumber.java       Java Foundations
//  Represents one rational number with a numerator and denominator.
//****************************************************************
public class RationalNumber implements Combine<RationalNumber>, Comparable<RationalNumber>
{
   private int numerator, denominator;

//-----------------------------------------------------------------
   //  Constructor: Sets up the rational number by ensuring a nonzero
   //  denominator and making only the numerator signed.
   //-----------------------------------------------------------------
   public RationalNumber (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      if (denom < 0)
      {
         numer = numer * (-1);
         denom = denom * (-1);
      }

      numerator = numer;
      denominator = denom;

   }

  //-----------------------------------------------------------------
   //  Returns the numerator of this rational number.
   //-----------------------------------------------------------------
   public int getNumerator ()
   {
      return numerator;
   }

   public void setNumerator (int num)
   {
       this.numerator = num;
   }

   //-----------------------------------------------------------------
   //  Returns the denominator of this rational number.
   //-----------------------------------------------------------------
   public int getDenominator ()
   {
      return denominator;
   }

   public void setDenominator(int denm)
   {
       this.denominator = denm;
   }
//-----------------------------------------------------------------
   //  Returns this rational number as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
    
      return result;
   }
   
   //adding the method from the interface
   public RationalNumber combine(RationalNumber x1)
   {
       int p,q,x,y,a,b;
       //for rational number 1
       p = x1.getNumerator ();
       q = x1.getDenominator ();
       //for rational number 2
       x = this.getNumerator ();
       y = this.getDenominator ();
       
       //setting the numerator and denominator for the new rational number
       a = ((p*y) + (q*x));
       b = q*y;

       return new RationalNumber(a,b);
    }

    //adding method for the comparable interface
    public int compareTo(RationalNumber a1)
    {
        int x,y,a,b,p,q;
        
        //splinting up the numbers for each rational #
        x = this.numerator;
        y = this.denominator;
        // rational 2 splitting
        a = a1.getNumerator();
        b = a1.getDenominator();
        //the numb to multiply
        p = y;
        q = b;
        
        //multiply each rational #
        x = x * q;
        y = y * q;
        
        a = a* p;
        b = b*p;
        
        //seeing which numerator is bigger 
        if (x < a)
            return 1;
        else if ( x > a)
            return -1;
        else
            return 0;
            
        
    }
    
}
