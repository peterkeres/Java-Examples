import java.util.HashMap;
import java.util.Map;

/**
 * assignment 5 , making the insert coin method and the enter label method
 *
 * A vending machine can hold different products that can be bought with coins
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class VendingMachine
{
    // instance variables
    private HashMap<String, ProductContainer> trays;
    private CoinContainer insertedCoins;
    public Container<Product> delivery;
    
    /**
     * Constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        trays = new HashMap<String, ProductContainer>();
        trays.put("A1", ProductContainer.createProductContainer(new Product("Cheetos", 25), 10));
        trays.put("A2", ProductContainer.createProductContainer(new Product("Oreos", 50), 15));
        trays.put("B1", ProductContainer.createProductContainer(new Product("Tostitos", 40), 12));
        
        insertedCoins = CoinContainer.defaultContainers();
        
        delivery = new Container<Product>();
    }
    
    
    // this will add a instance of coin into our total of coins for the machine
    public void insert(Coin coin)
    {
        insertedCoins.add(coin);
    }
    
    
    // this will take a string of what tray of products the user wants and puts it in the delivery tray 
    // only if they have the right amount of coins in the machine. 
    public void enterLabel(String label)
    {
        
        //checks for a valid label
        if ( trays.get(label) != null )
        {
            
            Product temp = trays.get(label).remove();
            
            // checks if there is enough coins in the machine to buy the product in question
            if ( temp.getValue() <= insertedCoins.getGrandTotalValue())
            {
                delivery.add(temp);
            }
            //puts item back if they cant buy it 
            else
            {
                trays.get(label).add(temp);
            }
            
        }
        
        
    }
    
    
    // this toString will show everything about the vending machine
    // will show items available in the machine along with prices and amount of products
    // will show the total of coins in the machine
    // will show what products are in the outbid tray
    @Override
    public String toString()
    {
        String string = "ITEMS AVAILABLE:\n";
        
        // using a map element named entry, we can go though all elements of the trays collection
        for (Map.Entry<String,ProductContainer> entry : trays.entrySet())
        {
            string += entry.toString() + "\n";
        }
 
        // shows the total value that is in the machine 
        string += "BALANCE: " + insertedCoins.getGrandTotalValue() + "\n";
        
        // shows whats in the outbid
        string += "OUTBID:\n";
        for (Product entry : delivery.getContents())
        {
            string += entry.getName() + "\n";
        }
        
        return string;
    }
    
    
}
