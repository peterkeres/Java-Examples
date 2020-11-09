import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 * Write a description of class Creator here.
 * A creator is someone who creates things. They can have multiple or just one creation
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Creator
{
    private String firstName;
    private String lastName;
    private Set<CreationType> types;
    private List<Creation> creations;
    private boolean forIndexing;

    /**
     * Constructor for objects of class Creator
     */
    public Creator()
    {
        this("No LastName");
    }
    
    public Creator(String lastName)
    {
        this(lastName, "No FirstName");
    }
    
    // Designated Constructor
    public Creator(String lastName, String firstName)
    {
        types = new HashSet<CreationType>();
        creations = new ArrayList<Creation>();
        setFirstName(firstName);
        setLastName(lastName);
        forIndexing = false;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setForIndexing(boolean forIndexing)
    {
        this.forIndexing = forIndexing;
    }
    
    public boolean getForIndexing()
    {
        return forIndexing;
    }
    
    public String getFullName()
    {
        return getFullName(forIndexing);
    }
    
    public String getFullName(boolean indexIt)
    {
        return indexIt?getLastName() + ", " + getFirstName():getFirstName() + " " + getLastName();
        // boolean test? when true : when false
        /*
        if(forIndexing)
        {
            return getLastName() + ", " + getFirstName();
        }
        else
        {
            return getFirstName() + " " + getLastName();
        }
        */
       /*
        String returnValue = getFirstName() + " " + getLastName();
        if(forIndexing)
        {
            returnValue = getLastName() + ", " + getFirstName();
        }
        return returnValue;
        */
    }
    
    public void addCreationType(CreationType newType)
    {
        types.add(newType);
    }
    
    public void addCreation(Creation newCreation)
    {
        creations.add(newCreation);
    }
    
    public List<CreationType> getTypes()
    {
        return new ArrayList<CreationType>(types);
    }
    
    public List<Creation> getCreations()
    {
        return new ArrayList<Creation>(creations);
        //return (ArrayList<Creation>)((ArrayList<Creation>)creations).clone();
    }
    
    public String toString()
    {
        return getFullName() + ": " + "number of types is " + types.size() + ", number of creations is " + creations.size();
    }
}
