
/**This class will hold all the stations that are on 1 particular route.
 *Peter Keres
 * 9-12-18
 * f@ck Cancer
 */

import java.util.*;



public class route 
{
    
    private String name;
    ArrayList<station> stationsList = new ArrayList<station>();
    
    
    /**
     * the constructor for this route object
     * @param name   will be the name of this route object 
     */
    public route (String name)
    {
        this.name = name;
    }
    
    /**
     * adding a new station to this route's object array list
     * expanding the array is handled by the add method of the list parent class
     * @param s   is the string of the name of the new station to be added to the stationsList
    */
    public void addStation( String s)
    {
        station x = new station(s);
        stationsList.add(x);
    }
    
    /**
     * will remove a station from this route's station list
     * @param s   is the string of the station to be deleted
     */
    public void removeStation (String s)
    {
        
        station x = new station(s);
        //to get out of an exception of delete an item from the list while searching it at same time
        //using a dummy object station called delete to hold the station i want to delete
        station delete = new station("delete");
        //on the strange occurrence someone would name a station "delete"
        boolean deleteFlag = false;
     
        for (station z : stationsList)
        {
            //if it finds that station wanting to delete, put a copy of that station in delete
            if (z.getNameStation().equalsIgnoreCase(x.getNameStation()))
            {
                delete = z;  
                deleteFlag = true;
            }
        }
        
        if (deleteFlag)
            stationsList.remove(delete);
    }
    
    /**
     * allows to change the name of route after the object was created
     * @param name    is a string of the name to call the route
     */
    public void setNameRoute (String name)
    {
        this.name = name;
    }
    
    /**
     * allows to retrieve the name of this route
     * @return    a string with the name of the route
     */
    public String getNameRoute ()
    {
        return name;
    }
    
}


