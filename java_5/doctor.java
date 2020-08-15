/**
 * the doctor class that is a child calss of hopstialEmployee
 * 
 * @author (Peter Keres) 
 * @version (4 6 2018)
 * f@ck Cancer
 */


public class doctor extends hospitalEmployee
{
    //var
    private String speciality;
    
    //constructor
    public doctor ( String bName, int bNumber, String bSpeciality)
    {
        super(bName, bNumber);
        speciality = bSpeciality;
    }
    
    
    //write a getter and setter
    public void setSpeciality (String bSpeciality)
    {
        speciality = bSpeciality;
    }
    
    public String getSpeciality ()
    {
        return speciality;
    }
    
    //diagnose or "toSTring"
    public String dignose ()
    {
        return super.work() + "\n" + "And they are a " + speciality + " doctor.";
    }
}
