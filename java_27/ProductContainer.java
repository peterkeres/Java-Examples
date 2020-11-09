
/**
 * Write a description of class ProductContainer here.
 * Is a container that can hold products
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class ProductContainer extends Container<Product>
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ProductContainer
     */
    public ProductContainer()
    {
        super();
    }
    
    @Override
    public void add(Product product)
    {
        if(getCount() == 0)
        {
            super.add(product);
        }
        else
        {
            Product sample = remove();
            if(product.equals(sample))
            {
                super.add(product);
            }
            super.add(sample);
        }
    }
    
    // this toString will return
    // what products this container holds
    // how much they cost
    // how many are in here
    // then adds the element we took out back into the container
    @Override
    public String toString()
    {
        
        Product temp = super.remove();
        
        String string = temp.getName() + " " + temp.getValue() + "C$ amount:" + (super.getCount()+1) ;
        
        super.add(temp);
        
        return string;
        
    }
    
    public static ProductContainer createProductContainer(Product product, int count)
    {
        ProductContainer pc = new ProductContainer();
        for(int counter = 0; counter < count; counter++)
        {
            pc.add(new Product(product.getName(), product.getValue()));
        }
        
        return pc;
    }
}
