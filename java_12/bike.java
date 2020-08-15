/**
 * bike class for assignment on inheritance 
 * 
 * @author (Peter Keres) 
 * @version (4 4 2018)
 * f@ck Cancer
 */


public class bike
{
    protected String color ;
    protected int gear;
    protected double price;
    
    //constructor 
    public bike ( String aColor, int aGear, double aPrice)
    {
        color = aColor;
        gear = aGear;
        price = aPrice;
    }
    
    //writing the setters
    public void setColor (String aColor)
    {
        color = aColor;
    }
    
    public void setGear (int aGear)
    {
        gear = aGear;
    }
    
    public void setPrice (double aPrice)
    {
        
        price= aPrice;
        
    }
    
    //write the getters
    public String getColor () 
    {
        return color;
    }
    
    public int getGear ()
    {
        return gear;
    }
    
    public double getPrice ()
    {
        return price;
    }
    
    //the toString
    public String toString ()
    {
        return "features: " + "\n" + "Color: " + color + "\t" + "gears: " + gear + "\t" + "price: " + price; 
    }
}
