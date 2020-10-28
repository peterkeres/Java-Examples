
package search_algorithms;

/**
 * this is the linked list structure for all the car objects before we turn it into an array
 * 
 * @author peter Keres
 * Date: Nov 16 2018
 * f@ck cancer
 */


public class carLinkedList {
    public carNode head = null;
    public carNode tail = null;
    public Integer size = 0;
    
    
    public carLinkedList(){
        
    }
    
    
    /**
     * Add a carNode to the head of the list
     * @param v 
     * the carNode object to be added
     */
    public void addFirst (carNode v){
        v.next = this.head;
        this.head = v;
        
        if (this.size.equals(0)){
            this.tail = this.head;
        }
        
        this.size = this.size + 1;
    }
    
    
    /**
     * Removes the first carNode and returns the data it was holding
     * this method assumes the list is non-empty
     * @return 
     * the car object that node was holding
     */
    public car removeFirst (){
        
        
        car removed = this.head.data;
        carNode newHead = this.head.next;
        
        this.head.next = null;
        this.head.data = null;
        
        this.head = newHead;
        this.size = this.size - 1;
        
        return (removed);
    }

    
}
