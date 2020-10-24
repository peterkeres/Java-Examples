package Double_Linked_List;

import Base_Code.GameEntry;

/**
 *This is the tester class for the double linked list
 * @author pete main
 * f@ck Cancer
 */


public class TesterDouble {
    
    
    public static void main(String[] args){
      
        
        GameEntry bob = new GameEntry("grand master",20);
        GameEntry sam = new GameEntry("Other guy ",500);
        GameEntry first = new GameEntry("guys sucks",100);
        GameEntry test = new GameEntry("what is happening",650);
        GameEntry test2 = new GameEntry("here we go again",600);
        DNode a = new DNode(bob,null,null);
        DNode b = new DNode(sam,null,null);
        DNode v = new DNode(first,null,null);
        DNode d = new DNode(test,null,null);
        DNode x = new DNode(test2,null,null);
        
        HiScoresDLL hsDList = new HiScoresDLL();
        
        hsDList.display();
        System.out.println();
        hsDList.add(bob);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        hsDList.add(sam);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
       
        hsDList.add(first);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        hsDList.add(test);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        
        System.out.println("NEW TEST LINE !!!!!!");
        hsDList.remove(4);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        
        hsDList.remove(3);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        
        hsDList.add(test2);
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        
        System.out.println("removed item" + hsDList.remove(1).toString());
        hsDList.display();
        System.out.println("size: " + hsDList.size + "head: " + hsDList.head.entry + "tail: " + hsDList.tail.entry);
        System.out.println();
        
        
    }
}
