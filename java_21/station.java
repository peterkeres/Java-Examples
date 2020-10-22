
/** This is the class that will be for the Stations on the subway route
 * Peter Keres
 * 9/12/18
 * f@ck Cancer
 */


public class station 
{
    private String name;
    
    /**
     * the constructor for the station class
     * @param name   sets a string to the name of this object
     */
    public station (String name)
    {
        this.name = name;
    }
    
    /**
     * allows us to use the value stored in the name
     * @return   returns a string of the name of this station
     */
    public String getNameStation()
    {
        return name;
    }
    
    /**
     * allows to change the name of the station after we have made the object
     * @param name     is the string of what the new name will be for the station
     */
    public void setNameStation( String name)
    {
        this.name = name;
    }
}
