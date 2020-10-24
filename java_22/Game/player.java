package Game;

/**
 * this is the Game.player class which is an child class of the Game.dealer
 * will hold new data such as name, total score, # of rounds
 * @author peter keres
 * date 10-28
 * f@ck cancer
 */


public class player extends dealer {
    protected String name = null;
    protected int totalScore = 0;
    protected int numRounds = 0;
    
    
    /**
     * makes a Game.player object for each new Game.player
     * @param c1
     * the first Game.card
     * @param c2
     * the second Game.card
     * @param name 
     * the name of the Game.player
     */
    public player (card c1,card c2,String name){
        super(c1,c2);
        this.name = name;
    }
    
    
    /**
     * this clears out each Game.player and sets all values to a zero state,
     * only need to be done after that Game.player is done with all rounds
     */
    public void clearPlayer (){
        super.clearRound();
        this.name = "";
        this.totalScore = 0;
        this.numRounds = 0;
    }
    
    /**
     * will keep track of the total score for the Game.player
     * score is based on there hand value if they win the round
     * @param score 
     * the score you add after they win or lose the round
     */
    public void addTotalScore (int score){
        totalScore = totalScore + score;
    }
    
    
    /**
     * will keep track of the number of rounds the Game.player has played
     * adds one to each time its called
     */
    public void  addNumRounds (){
        numRounds = numRounds + 1;
    }
    
    /**
     * 
     * @return 
     * the name of the Game.player
     */
    public String getName (){
        return (name);
    }
    
    
    /**
     * 
     * @return
     * the number of rounds 
     */
    public int getNumRounds (){
        return (numRounds);
    }
    
    
    /**
     * 
     * @return
     * the total score for the Game.player
     */
    public int getTotalScore (){
        return (totalScore);
    }   
}
