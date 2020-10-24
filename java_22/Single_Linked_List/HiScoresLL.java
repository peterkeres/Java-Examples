package Single_Linked_List;

import Base_Code.GameEntry;
import Base_Code.Node;

/**
 * This is the linked list class that will let us travel the node objects
 * holding the gantry object
 * 
 * @author peter keres
 * f@ck Cancer
 */


public class HiScoresLL {

    public Node head = null;
    public Node tail = null;
    public Integer size = 0;
    
    /**
     * Constructor that creates an empty list
     */
    public HiScoresLL () {
    }

    /**
     * Prints out all the game entries in the linked list
     */
    public void display (){
        
        Node current = this.head;
        
        if(this.size.equals(0))
            System.out.println("There are no scores");
        else{
            for (int i=0; i < this.size; i++)
            {
                System.out.println(current.entry);
                current = current.next;
            }
        }
    }
    
    /**
     * Add a node to the head of the list
     * @param v 
     * the Base_Code.Node object to be added
     */
    public void addFirst (Node v){
        v.next = this.head;
        this.head = v;
        
        if (this.size.equals(0)){
            this.tail = this.head;
        }
        
        this.size = this.size + 1;
    }
    
    /**
     * Removes the first node and returns the entry it was holding
     * this method assumes the list is non-empty
     * @return 
     * the Base_Code.GameEntry that node was holding
     */
    public GameEntry removeFirst (){
        
        
        GameEntry removed = this.head.entry;
        Node newHead = this.head.next;
        
        this.head.next = null;
        this.head.entry = null;
        
        this.head = newHead;
        this.size = this.size - 1;
        
        return (removed);
    }
    
    /**
     * add a node to the tail of the list
     * @param v 
     * the Base_Code.Node object to be added
     */
    public void addLast (Node v){
        
        if (this.size.equals(0)){
            this.head = v;
            this.head.next = null;
            this.tail = v;
            this.tail.next = null;
        }
        else{
            v.next = null;
            this.tail.next = v;
            this.tail = v;
        }
        this.size = this.size + 1;
    }
    
    /**
     * Assuming the list of game entries is in decreasing order by score,
     * this method creates a Base_Code.Node with the given Base_Code.GameEntry e, and then
     * inserts it in the appropriate spot in the list.
     * @param e 
     * the Base_Code.GameEntry object to be added to the list
     */
    public void add (GameEntry e){
        Node current = this.head;
        Node add = new Node(e,null);
        
        if (size.equals(0))   
            addFirst(add);
        else if (this.size.equals(1)){
            if (e.getScore() > current.entry.getScore()){
                addFirst(add);
            }
            else{
                addLast(add);
            }
        }
        else{
            
            if (e.getScore() > this.head.entry.getScore())
                addFirst(add);
            else{
                Node previous = this.head;
                current = this.head.next;
                boolean found = false;

                for (int i = 1; i < this.size; i++){
                    if (e.getScore() > current.entry.getScore()){
                        previous.next = add;
                        add.next = current;
                        this.size = this.size + 1;
                        i = this.size;                   //to force exit the loop    
                        found = true;               
                        }
                    else{
                        previous = previous.next;
                        current = current.next;
                    }
                }
                
                if (!found)                     //if no spot for it to go, put at end
                   addLast(add);
                }
            }
    }
    
    /**
     * removes the ith node from the list, starting at 1 for the first element
     * not to be confused with an array structure of starting at 0
     * @param i
     * is the number of node to be removed
     * @return 
     * the Base_Code.GameEntry of the node removed
     * or null if position i is invalid
     */
    public GameEntry remove (int i){
        
        GameEntry remove = this.head.entry;
        
        if (i <= 0 || i > this.size || this.size.equals(0))
            return null;
        else{
            if (i == 1)
                removeFirst();
            else{
                Node current = this.head.next;
                Node previous = this.head;
                
                for (int j=2; j <= this.size; j++){
                    if (i == j){
                        remove = current.entry;
                        previous.next = current.next;
                        current.next = null;
                        current.entry = null;
                        if (this.size.equals(j))
                            this.tail = previous;
                        this.size = this.size - 1;
                        return (remove);
                    }
                    current = current.next;
                    previous = previous.next;
                }
            }
        }
        
        return (remove);
    }
    
    
}
