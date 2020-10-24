package Game;
/**
 * this class will hold the current Game.deck that the Game.player and Game.dealer draws from,
 * will be sent a new Game.deck at start of every round
 * @author peter keres
 * date 10-28
 * f@ck cancer
 */

import java.util.*;

public class deck {
    
    ArrayList<card> deck = new ArrayList<card>();
    
    
    /**
     * the constructor will make a new fresh Game.deck of 52 cards
     */
    public deck (){
        resetDeck();
    }
    
    
    /**
     * this will reset the Game.deck to the original Game.deck of 52 cards,
     */
    public void resetDeck (){
        deck.clear();
        card aceHeart = new card("A","H");
        card twoHeart = new card("2","H");
        card threeHeart = new card("3","H");
        card fourHeart = new card("4","H");
        card fiveHeart = new card("5","H");
        card sixHeart = new card("6","H");
        card sevenHeart = new card("7","H");
        card eightHeart = new card("8","H");
        card nineHeart = new card("9","H");
        card tenHeart = new card("10","H");
        card jackHeart = new card("J","H");
        card queenHeart = new card("Q","H");
        card kingHeart = new card("K","H");
        
        card aceDiamond = new card("A","D");
        card twoDiamond = new card("2","D");
        card threeDiamond = new card("3","D");
        card fourDiamond = new card("4","D");
        card fiveDiamond = new card("5","D");
        card sixDiamond = new card("6","D");
        card sevenDiamond = new card("7","D");
        card eightDiamond = new card("8","D");
        card nineDiamond = new card("9","D");
        card tenDiamond = new card("10","D");
        card jackDiamond = new card("J","D");
        card queenDiamond = new card("Q","D");
        card kingDiamond = new card("K","D");
        
        card aceClub = new card("A","C");
        card twoClub = new card("2","C");
        card threeClub = new card("3","C");
        card fourClub = new card("4","C");
        card fiveClub = new card("5","C");
        card sixClub = new card("6","C");
        card sevenClub = new card("7","C");
        card eightClub = new card("8","C");
        card nineClub = new card("9","C");
        card tenClub = new card("10","C");
        card jackClub = new card("J","C");
        card queenClub = new card("Q","C");
        card kingClub = new card("K","C");
        
        card aceSpade = new card("A","S");
        card twoSpade = new card("2","S");
        card threeSpade = new card("3","S");
        card fourSpade = new card("4","S");
        card fiveSpade = new card("5","S");
        card sixSpade = new card("6","S");
        card sevenSpade = new card("7","S");
        card eightSpade = new card("8","S");
        card nineSpade = new card("9","S");
        card tenSpade = new card("10","S");
        card jackSpade = new card("J","S");
        card queenSpade = new card("Q","S");
        card kingSpade = new card("K","S");

        deck.add(aceHeart);
        deck.add(twoHeart);
        deck.add(threeHeart);
        deck.add(fourHeart);
        deck.add(fiveHeart);
        deck.add(sixHeart);
        deck.add(sevenHeart);
        deck.add(eightHeart);
        deck.add(nineHeart);
        deck.add(tenHeart);
        deck.add(jackHeart);
        deck.add(queenHeart);
        deck.add(kingHeart);
        
        deck.add(aceDiamond);
        deck.add(twoDiamond);
        deck.add(threeDiamond);
        deck.add(fourDiamond);
        deck.add(fiveDiamond);
        deck.add(sixDiamond);
        deck.add(sevenDiamond);
        deck.add(eightDiamond);
        deck.add(nineDiamond);
        deck.add(tenDiamond);
        deck.add(jackDiamond);
        deck.add(queenDiamond);
        deck.add(kingDiamond);
        
        deck.add(aceClub);
        deck.add(twoClub);
        deck.add(threeClub);
        deck.add(fourClub);
        deck.add(fiveClub);
        deck.add(sixClub);
        deck.add(sevenClub);
        deck.add(eightClub);
        deck.add(nineClub);
        deck.add(tenClub);
        deck.add(jackClub);
        deck.add(queenClub);
        deck.add(kingClub);
        
        deck.add(aceSpade);
        deck.add(twoSpade);
        deck.add(threeSpade);
        deck.add(fourSpade);
        deck.add(fiveSpade);
        deck.add(sixSpade);
        deck.add(sevenSpade);
        deck.add(eightSpade);
        deck.add(nineSpade);
        deck.add(tenSpade);
        deck.add(jackSpade);
        deck.add(queenSpade);
        deck.add(kingSpade);
    }
    
    
    /**
     * this will act like drawing one Game.card from the Game.deck
     * @return 
     * Game.card object that was drawn from the Game.deck
     */
    public card draw(){
        Random rand = new Random();
        
        int random = rand.nextInt(deck.size());
        
        card drawnCard = deck.get(random);
        deck.remove(random);
        
        return (drawnCard);
    }
    
    
}
