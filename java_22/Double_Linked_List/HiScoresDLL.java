package Double_Linked_List;

import Base_Code.GameEntry;

/**
 *This is the double linked list class that will let us travel all,
 * the Double_Linked_List.DNode objects that hold Base_Code.GameEntry objects
 * @author peter keres
 * f@ck Cancer
 */


public class HiScoresDLL {
    public DNode head = null;
    public DNode tail = null;
    public Integer size = 0;
    
    /**
     * Constructor that creates an empty list
     */
    public HiScoresDLL () {
    }
    
    
    /**
     * returns the node at the ith spot in the linked list
     * @param i
     * what element you want to return
     * @return 
     * the ith Double_Linked_List.DNode element in the linked list
     */
    public DNode getNode (int i){
        DNode current = head;
        
        for (int j=1; j < i; j++){
            current= current.next;
        }
        return (current);
    }
    /**
     * Prints out all the game entries in the linked list
     */
    public void display (){
        
        DNode current = this.head;
        
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
     * Assuming the list of game entries is in decreasing order by score,
     * this method creates a Base_Code.Node with the given Base_Code.GameEntry e, and then
     * inserts it in the appropriate spot in the list.
     * @param e 
     * the Base_Code.GameEntry object to be added to the list
     */
    public void add (GameEntry e){
        DNode add = new DNode(e,null,null);
        
        if (size.equals(0)){                                            //to handle if the list is empty 
            this.head = add;
            this.tail = add;
            this.size = this.size + 1;
        }
        else if(add.entry.getScore() > this.head.entry.getScore()){               //to handle if the item should be at head of list
            add.next = this.head;
            this.head.prev = add;
            this.head = add;
            this.size = this.size + 1;
        }
        else{       
            DNode current = this.head.next;
            boolean found = false;
            
            for (int i = 1; i < this.size; i++){
                if (add.entry.getScore() > current.entry.getScore()){
                    
                    add.next = current;
                    add.prev = current.prev;
                    
                    DNode temp = current.prev;                          // to access the fields of the prev entry in the list
                    temp.next = add;
                     
                    current.prev = add;
                    
                    found = true;
                    i = this.size;
                }
                else
                    current = current.next;
            }
            if (!found){                                                // if the item is not found in list, make it the tail 
                add.prev = this.tail;
                this.tail.next = add;
                this.tail = add;
            }
            this.size = this.size + 1;
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
        
        if (i > this.size || i <= 0 || size <= 0)                // to not allow a number we cant use for i 
            return (null);
        else{
            DNode current = this.head;                  
            GameEntry remove = new GameEntry(null,0);
            if (i == 1){                                        // if the number to remove is the head element
                this.head = current.next;
                head.prev = null;
                
                remove = current.entry;
                
                current.next = null;
                current.prev = null;
                current.entry = null;
                
               this.size = this.size - 1;
               return (remove);
            }
            else if (i == this.size){                           // if the number to remove is the tail element 
                current = this.tail;
                this.tail = current.prev;
                this.tail.next = null;
                
                remove = current.entry;
                
                current.next = null;
                current.prev = null;
                current.entry = null;
                
                this.size = this.size - 1;
                return (remove);
            }
            else{                                               // the number is in the list
                current = current.next;
                
                for (int j = 2; j < this.size;j++){             // no need to look a first and last element
                    if (j == i){
                        DNode after = current.next;
                        DNode before = current.prev;
                        
                        after.prev = before;
                        before.next = after;
                        
                        remove = current.entry;
                        
                        current.next = null;
                        current.prev = null;
                        current.entry = null;
                        
                        this.size = this.size - 1;
                        j = this.size;                              // force break the loop
                    }
                    else
                        current = current.next;
                }               
            }
            
        return (remove);
        }
    }
}
