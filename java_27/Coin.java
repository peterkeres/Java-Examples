
/**
 * Write a description of class Coin here.
 * Well its a coin!
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Coin
{
    // instance variables - replace the example below with your own
    private int value; // value is in cents

    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        this(1);
    }
    
    public Coin(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
