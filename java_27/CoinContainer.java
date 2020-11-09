
/**
 * Write a description of class CoinContainer here.
 * A container that holds coin objects
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class CoinContainer extends Container<Coin>
{
    private int value;
    private CoinContainer next;
    /**
     * Constructor for objects of class CoinContainer
     */
    public CoinContainer()
    {
        this(1);
    }
    
    public CoinContainer(int value)
    {
        super();
        this.value = value;
        next = null;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public int getTotalValue()
    {
        return getCount() * getValue();
    }
    
    public int getGrandTotalValue()
    {
        return getTotalValue() + (next == null?0:next.getGrandTotalValue());
    }
    
    @Override
    public void add(Coin coin)
    {
        if(coin.getValue()  == getValue())
        {
            super.add(coin);
        }
        else
        {
            if(next != null)
            {
                next.add(coin);
            }
        }
    }
    
    public void append(CoinContainer cc)
    {
        if(next == null)
        {
            next = cc;
        }
        else
        {
            next.append(cc);
        }
    }
    
    public static CoinContainer defaultContainers()
    {
        CoinContainer cc = new CoinContainer(100);
        cc.append(new CoinContainer(50));
        cc.append(new CoinContainer(25));
        cc.append(new CoinContainer(10));
        cc.append(new CoinContainer(5));
        cc.append(new CoinContainer(1));
        
        return cc;
    }
    
    
}
