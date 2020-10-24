package Single_Linked_List;

import Base_Code.GameEntry;
import Base_Code.Node;

/**
 * this is used to test the code of the Single_Linked_List.HiScoresLL class
 * 
 * @author pete keres
 * f@ck cancer
 */
public class TesterSingle {
    
    
    public static void main (String[] args){
        
        GameEntry bob = new GameEntry("grand manster",1000);
        GameEntry sam = new GameEntry("Other guy ",69);
        GameEntry first = new GameEntry("guys sucks", 20);
        GameEntry test2 = new GameEntry("here we go again", 5);
        Node a = new Node(bob,null);
        Node b = new Node(sam,null);
        Node c = new Node(first,null);
        Node s = new Node(test2,null);
        
        
        HiScoresLL hsList = new HiScoresLL();
    
        hsList.display();
        System.out.println("");
        hsList.add(bob);
        hsList.display();
        System.out.print("size: " + hsList.size + "head: " + hsList.head.entry + "tail: " + hsList.tail.entry);
        System.out.println("");
        hsList.add(sam);
        hsList.display();
        System.out.print("size: " + hsList.size + "head: " + hsList.head.entry + "tail: " + hsList.tail.entry);
        System.out.println("");
        
        
        /**
        hsList.addFirst(a);
        hsList.addFirst(b);
        hsList.display();
        System.out.println("above is the list");
        System.out.println("");
        
        if (hsList.remove(8) instanceof Base_Code.GameEntry)
            System.out.println("Found it");
        else
            System.out.println("cant find it fam");
        
        System.out.println("size: " + hsList.size);
        System.out.println("head entry: " + hsList.head.entry.name);
        System.out.println("Tail entry: " + hsList.tail.entry.name);
        System.out.println("");
        System.out.println("below is the new list");
        hsList.display();
        
        
        hsList.addFirst(g);
        hsList.addFirst(v);
        hsList.addFirst(b);
        hsList.display();
        System.out.println("above is the list");
        System.out.println("");
        hsList.add(test);
        hsList.addLast(h);
        hsList.removeFirst();
        hsList.removeFirst();
        System.out.println("size: " + hsList.size);
        System.out.println("head entry: " + hsList.head.entry.name);
        System.out.println("Tail entry: " + hsList.tail.entry.name);
        System.out.println("");
        System.out.println("below is the new list");
        hsList.display();
        */
        
        /**
        hsList.addFirst(b);
        hsList.addFirst(v);
        hsList.addFirst(g);
        hsList.display();
        
        System.out.println("");
        System.out.println(hsList.removeFirst().toString());
        System.out.println("");
        hsList.display();
        System.out.println("");
        hsList.addLast(h);
        hsList.display();
        */
        
        
        
    }
}
