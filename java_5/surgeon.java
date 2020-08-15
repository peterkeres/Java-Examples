
/**
 * child class for a surgeon from the parent class hospitalemplyoee
 *
 * @author (Peter Keres)
 * @version (4 6 2018)
 * f@ck Cancer
 * 
 */


public class surgeon extends hospitalEmployee
{
    //var
    private String organ;
    
    
    //con
    public surgeon ( String bName, int bNumber, String bOrgan)
    {
        super(bName, bNumber);
        organ = bOrgan;
    }
    
    
    //setters and getters
    public void setOrgan (String bOrgan)
    {
        organ = bOrgan;
    }
    
    public String getOrgan ()
    {
        return organ;
    }
    
    
    //job or "toString"
    public String job()
    {
        return super.work() + "\n" + "And they are a " + organ + " surgeon.";
    }
}
