package Game;
/**
 *  this Game.dealer class will hold information about the deal and what cards he is,
 * holding. this will also be the super class for the Game.player object
 * @author peter keres
 * date 10-28
 * f@ck cacner
 */
import java.util.*;

public class dealer {
    
    protected int handScore = 0;
    protected ArrayList<card> hand = new ArrayList<card>();
    
    
    /**
     * constructor class, will create a hand score on first 2 items
     * @param c1
     * the first Game.card object
     * @param c2 
     * the second Game.card object
     */
    public dealer (card c1, card c2){
        hand.add(c1);
        hand.add(c2);
        handScore = c1.getValue() + c2.getValue();
    }
    
    
    /**
     * used to clear out the fields after each round
     * for the Game.dealer and Game.player after each round
     */
    public void clearRound(){
        handScore = 0;
        hand.clear();
    }
    
    /**
     * this hands any cards to the dealers hand 
     * @param c1 
     * the Game.card object we are adding
     */
    public void addHand (card c1){
        hand.add(c1);
        handScore = handScore + c1.getValue();
    }
    
    
    /**
     * prints out each Game.card object to the screen
     */
    public void printHand (){
        for (int i=0; i < hand.size(); i ++)
            hand.get(i).frontArt();
    }
    
    
    /**
     * 
     * @return
     * gets the hand array list holding the Game.card objects
     */
    public ArrayList<card> getHand (){
        return (hand);
    }
    
    
    /**
     * 
     * @return
     * gets the hand score of the Game.dealer used to compare hands
     */
    public int getHandScore (){
        return (handScore);
    }
    
    
    
    
    
    
    
}
