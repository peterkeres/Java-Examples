import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Container here.
 * Is a class that holds objects
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Container<E>
{
    // instance variables - replace the example below with your own
    private List<E> contents;

    /**
     * Constructor for objects of class Container
     */
    public Container()
    {
        contents = new ArrayList<E>();
    }
    
    public int getCount()
    {
        return contents.size();
    }
    
    public void add(E item)
    {
        contents.add(item);
    }
    
    public List<E> getContents()
    {
        return this.contents;
    }
    
    public E remove()
    {
        return getCount() > 0?contents.remove(0):null;
        /*
        if(getCount() > 0)
        {
            return contents.remove(0);
        }
        else
        {
            return null;
        }
        */
    }

}
