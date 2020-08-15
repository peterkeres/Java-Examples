public class tandemBike extends bike
{
    private int numSeats, numWheels;
    
    //constructor
    public tandemBike (String bColor, int bGear, double bPrice, int bNumSeats, int bNumWheels)
    {
        super(bColor, bGear, bPrice);
        numSeats = bNumSeats;
        numWheels = bNumWheels;
    }
    
    //write the setters
    
    public void setNumSeats (int newNumSeats)
    {
        numSeats = newNumSeats;
    }
    
    public void setNumWheels (int newNumWheels)
    {
        numWheels = newNumWheels;
    }
    
    //write the getters
    public int getNumSeats()
    {
        return numSeats;
    }
    
    public int getNumWheels ()
    {
        return numWheels;
    }     
    
    //toString
    
    public String toString ()
    {
        return super.toString() + "\n" + "Number of seats: " + numSeats + "\t" + "Number of wheels: " + numWheels;
    }
}






