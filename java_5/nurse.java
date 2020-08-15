/**
 * child class about nurse from hospitalemployee
 * 
 * @author (Peter Keres) 
 * @version (4 6 2018)
 * f@ck Cancer
 */


public class nurse extends hospitalEmployee
{
    //vars
    private int numPatients;
    
    //con
    public nurse (String bName, int bNumber, int bNumPatients)
    {
        super(bName,bNumber);
        numPatients = bNumPatients;
    }
    
    //getters and setters
    public void setNumPatients ( int bNumPatients)
    {
        numPatients = bNumPatients;
            
    }
    
    public int getNumPatients ()
    {
        return numPatients;
    }
    
    //assist or the "toSTring"
    public String assist ()
    {
        return super.work() + "\n" + " They are a nurse with " + numPatients + " nubmer of paitents.";
    }
    
}