
/**
 * child class of the bike class
 *
 * @author (Peter Keres)
 * @version (4 4 2018)
 * f@ck Cacner
 */


public class kidBike extends bike
{
   private boolean trainingWheels;
   
   //write constructor
   public kidBike (String bColor, int bGear, double bPrice, boolean bTrainingWheels)
   {
       super(bColor, bGear, bPrice);
       trainingWheels = bTrainingWheels;
    }
    
   //write the setter and getters
   public void setTrainingWheels ( boolean newTrainingWheels)
   {
       trainingWheels = newTrainingWheels;
    }
    
   public boolean getTrainingWheels ()
   {
       return trainingWheels;
    }
    
    //toString
    public String toString ()
    {
        return super.toString() + "\n" + "TrainingWheels: " + trainingWheels;
    }
    
}
