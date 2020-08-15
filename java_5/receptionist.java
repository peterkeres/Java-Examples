/**
 * is a child class for a receptionist under the parent class hospitalemployee
 * 
 * @author (Peter Keres) 
 * @version (4 6 2018)
 * f@ck Cancer
 * 
 */


public class receptionist extends hospitalEmployee
{
    //var
    private String building;
    private boolean phone;
    
    //con
    public receptionist ( String bName, int bNumber, String bBuilding, boolean bPhone)
    {
        super(bName, bNumber);
        building = bBuilding;
        phone = bPhone;
    }
    
    
    //setters
    public void setBuilding (String bBuilding)
    {
        building = bBuilding;
    }
    
    public void setPhone (boolean bPhone)
    {
        phone = bPhone;
    }
    
    //getters
    public String getBuilding ()
    {
        return building;
    }
    
    public boolean getPhone ()
    {
        return phone;
    }
    
    
    //area or the "toString"
    public String area ()
    {
        if ( phone == true)
            return super.work() + "\n" + "They work as a receptionist in the " + building + " office and they answer phones.";
        else
            return super.work() + "\n" + "They work as a receptionist in the " + building + " office.";
    }    
        
}
