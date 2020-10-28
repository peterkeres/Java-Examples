
package search_algorithms;

/**
 *  this will be the node for each car object
 *  this will be used when importing from the file 
 * 
 * @author peter keres
 * date: Nov 16 2018
 * f@ck cancer
 */


public class carNode {
    public carNode next = null;
    public car data = null;
    
    /**
     * is the constructor for nodes that hold a car object
     * @param dataB
     * the car object for this to hold
     * @param nextB 
     * the next node this node points to
     */
    public carNode (car dataB, carNode nextB){
        this.data = dataB;
        this.next = nextB;
    }

    
}
