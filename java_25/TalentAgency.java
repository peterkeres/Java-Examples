import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 * purpose: this is for assigment 1 in CPSC 3175
 *      it is to create a "talent agency" class that holds a list of creators
 */

public class TalentAgency {


    private String Title;
    private String address;
    private Set<Creator> Creators;      //use a set because we cant have the exact same "creator"


    public TalentAgency ()
    {
        this("-NA-");
    }

    
    public TalentAgency (String title)
    {
        this(title,"-NA-");
    }
    
    
    //the designated constructor
    //using this "water-fall" type of constructors, we have many options when creating a instances of this class
    //along with reusing code and funneling the code into one place making it easier to debug
    public TalentAgency (String title, String address)
    {
        this.Creators = new HashSet<Creator>();
        //using our set methods to again funnel the code into one place
        setTitle(title);
        setAddress(address);
    }
    
    
    // using setters/getters so there is no "direct access" to the variables of this class
    public void setTitle(String title)
    {
        this.Title = title;
    }
    
    
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    
    
    public String getTitle()
    {
        return this.Title;
    }
    
    
    
    public String getAddress()
    {
        return this.address;
    }
    
    
    // the add and remove for creator both return a boolean value to let anyone know if this operations was successful or not
    public boolean addCreator (Creator newCreator)
    {
        return this.Creators.add(newCreator);
    }
    
    
    
    public boolean removeCreator (Creator rmCreator)
    {
        return this.Creators.remove(rmCreator);
    }
    
    
    //this returns a copy of the creators set as a ArrayList type, instead of the direct address of the set itself 
    public List<Creator> getCreator ()
    {
        return new ArrayList<Creator>(Creators);
    }
    
    
    //this returns a Arraylist of creator's of a picture type.
    //this allows the getCreator method to be more flexible by ether taking a parameter or not
    public List<Creator> getCreator (CreationType Type)
    {
        //makes a temporary copy of creators set, but again using the idea of funneling
        List<Creator> temp = getCreator();
        
        
        //will go though the temp list and check for any Creator that can create the type of type, if not it removes it from the list
        for (int i = 0; i < temp.size(); i++)
        {
            if ( temp.get(i).getTypes().contains(Type) )
            {
                continue;
            }
            else
            {
                temp.remove(i);
                i --;               // because remove shifts all items to left 1, to save from skipping over a number
            }
        }
        
       return new ArrayList<Creator>(temp);
    }
    
    
    
    //override this toString method to allow us to identify this object for debugging
    @Override
    public String toString()
    {
        return "Name of Agency is: " + getTitle() + " , Address is: " + getAddress() + " , Number of Creators is: " + Creators.size();
    }
}
