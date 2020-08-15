/**
 * is a parent class for lab on inheritance work
 * 
 * @author (Peter Keres) 
 * @version (4 6 2018)
 * f@ck Cancer
 */


public class hospitalEmployee
{
    protected String name;
    protected int number;
    
    //constructor
    public hospitalEmployee ( String aName, int aNumber)
    {
        name = aName;
        number = aNumber;
    }
    
    
    //write the setters
    public void setName( String aName)
    {
        name = aName;
    }
    
    public void setNumber (int aNumber)
    {
        number = aNumber;
    }
    
    //write the getters
    public String getName ()
    {
        return name;
    }
    
    public int getNumber ()
    {
        return number;
    }
    
    
    //the work method "the toString "
    
    public String work ()
    {
        return "The employee's name is " + name + " and there number is " + number ;
    }
}