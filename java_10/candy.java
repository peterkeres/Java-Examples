
/**
 * The is the candy calss for the final
 * 
 * this class will hold, an expiration month and year, price, and a product code
 * will also use a toSting method and a compareTo method( comparing the price)
 * 
 * 
 *
 * @author (Peter Keres)
 * @version (5 9 2018)
 * F@ck cacner
 */

public class candy implements Comparable<candy>
{
    //var of this calss
    private Double price;
    private String exMonth,exYear;
    private String pCode;
    
    
    
    
    //constructor
    public candy (String aPCode, Double aPrice, String aExMonth, String aExYear) 
    {
        price = aPrice;
        exMonth = aExMonth;
        exYear = aExYear;
        pCode = aPCode;
    }
    
    
    
    //the compareTo interface
    public int compareTo (candy oCandy)
    {
        if (this.price > oCandy.price)
            return -1;
        else if (this.price < oCandy.price)
            return 1;
        else
            return 0;
        
    }
    
    
    //the to string method
    public String toString()
    {
        return "Product code: " + pCode + " Expire month: " + exMonth + " Expire year: " + exYear+ " Price: " + price;
    }
        
        
}
