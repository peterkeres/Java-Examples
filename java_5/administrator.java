/**
 * is a child class for an administrator from the hospital employee class
 * 
 * @author (Peter Keres) 
 * @version (4 6 2018)
 * */


public class administrator extends hospitalEmployee
{
    //var
    private String departmentHead;
    
    //con
    public administrator (String bName, int bNumber, String bDeparmentHead)
    {
        super(bName,bNumber);
        departmentHead = bDeparmentHead;
    }

    //setters and getters
    public void setDeparmentHead ( String bDeparmentHead)
    {
        departmentHead = bDeparmentHead;
    }

    public String getDeparmentHead ()
    {
        return departmentHead;
    }
    
    //chargeOf or the "toSTring"
    public String chargeOf()
    {
        return super.work() + "\n" + "They are in charge of the " + departmentHead + " deparment.";
    }
}

