
/**
 * Write a description of class Product here.
 * A product is an item that can be bought in the vending machine
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private int value;
    private String name;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        this("No Name");
    }
    
    public Product(String name)
    {
        this(name, 1);
    }
    
    public Product(String name, int value)
    {
        this.name = name;
        this.value = value;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getValue()
    {
        return value;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(getName().equals(((Product)obj).getName()) && getValue() == ((Product)obj).getValue())
        {
            return true;
        }
        else
        {
        return false;
    }
    }
}
