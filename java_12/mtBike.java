/**
 * is the child class of bike 
 * 
 * @author (Peter Keres) 
 * @version (4 4 2018)
 * F@ck Cancer
 */


public class mtBike extends bike
{
   private int shock;
   private double tireThickness;
   
   //write constructor
   public mtBike (String bColor, int bGear, double bPrice, int bShock, double bTireThickness)
   {
       super(bColor, bGear, bPrice);
       
       shock = bShock;
       tireThickness = bTireThickness;
    }
    
   //setter
   public void setShock (int newShock)
   {
       shock = newShock;
    }
    
   public void setTireThickness ( double newTireThickness)
   {
       tireThickness = newTireThickness;
    }
    
    //getters
    public int getShock ()
    {
        return shock;
    }
    
    public double getTireThickness ()
    {
        return tireThickness;
    }
    
    //the toString
    public String toString ()
    {
        return super.toString() + "\n" + "shock: " + shock + "\t" + "tirethickness: " + tireThickness;
    }
    
}