
/**
 * Write a description of class Chocolate here.
 *
 * @author (Peter Keres)
 * @version (4 18 2018)
 * f@ck cancer
 */

public class Chocolate implements Comparable<Chocolate>{

    private String name;
    private int quantity;

    public Chocolate(String cName, int cQuantity) {
        this.name = cName;
        this.quantity = cQuantity;
    }

    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int compareTo(Chocolate obj){
        if (this.quantity > obj.getQuantity())
            return -1;
        else if (this.quantity < obj.getQuantity())
            return 1;
        else
            return 0;
     }
}
