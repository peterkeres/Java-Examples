package Game;
/**This class will hold the main for the blackJakeGame
 * will allow the Game.player to play 10 rounds and keep the score and put into,
 * a score list which will be printed into a file
 *
 * @author peter keres
 * 10-27
 * f@ck cancer
 */

import Base_Code.GameEntry;

import java.util.*;


public class blackJackGame {
    /**
     * this method will start and finish a 5 round game for any new Game.player
     * @return 
     * a Base_Code.GameEntry object that can be added to a list of high scores
     */
    public GameEntry start(){
        Scanner scan = new Scanner(System.in);
        String playerName = null;
        String playerChoice = null;
        deck cDeck = new deck();
        
        System.out.println("welcome to blackJack!");
        System.out.println("pleas enter your user name.");
        playerName = scan.next();
        
        dealer dealer = new dealer(cDeck.draw(),cDeck.draw());
        player player = new player(cDeck.draw(),cDeck.draw(),playerName);
        
        
        do{   
            System.out.println();
            System.out.println();
            //players turn to add cards
            int checkScore = player.getHandScore();
            while (checkScore <= 21){
                System.out.println("Dealers hand: ");
                dealer.getHand().get(0).frontArt();
                dealer.getHand().get(1).backArt();
                System.out.println("Dealers hand score is " + dealer.getHand().get(0).value);
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(player.getName()+"'s hand: ");
                player.printHand();
                System.out.println("Your hand score is at " + player.getHandScore());
                System.out.println("Would you like to hit ?");
                playerChoice = scan.next();
                while(!(playerChoice.equalsIgnoreCase("yes")) & !(playerChoice.equalsIgnoreCase("y")) & !(playerChoice.equalsIgnoreCase("no")) & !(playerChoice.equalsIgnoreCase("n"))){
                    System.out.println("Sorry please type a yes if you want to hit, no otherwise");
                    playerChoice = scan.next();
                }
                if (playerChoice.equalsIgnoreCase("yes") || playerChoice.equalsIgnoreCase("y")){
                    player.addHand(cDeck.draw());
                    checkScore = player.getHandScore();  
                }
                else
                    checkScore = 22;
            }

            //dealers turn to add cards
            while (dealer.getHandScore() <= 16){
                dealer.addHand(cDeck.draw());
            }

            //comparing hands 
            if (dealer.getHandScore() >= 22 & player.getHandScore() <= 21){
                System.out.println("The Game.dealer bust!");
                player.totalScore = player.totalScore + player.handScore;
            }
            else if (player.getHandScore() >= 22 & dealer.getHandScore() <= 21)
                System.out.println("the Game.player bust!");
            else if (dealer.getHandScore() >= 22 & player.getHandScore() >= 22)
                System.out.println("both players bust!");
            else{
                if(dealer.getHandScore() >= player.getHandScore())
                    System.out.println("the Game.dealer wins!");
                else{
                    System.out.println("the Game.player wins!");
                    player.totalScore = player.totalScore + player.handScore;
                }
            }

            System.out.println("Game.dealer score: " + dealer.getHandScore());
            System.out.println("Player score: " + player.getHandScore());
            System.out.println("enter n for next hand...");
            scan.next();        // this is just so the user can see the score before going to next round
            

            player.addNumRounds();

            //resets for the next round
            player.clearRound();
            dealer.clearRound();
            cDeck.resetDeck();
            
            //gets a new hand for the deal and the Game.player
            dealer.addHand(cDeck.draw());
            dealer.addHand(cDeck.draw());
            player.addHand(cDeck.draw());
            player.addHand(cDeck.draw());
        }
        while (player.getNumRounds() < 5);  //number of rounds we want user to play 
        
        clearScreen();
        
        System.out.println("thank you so much for playing " + player.getName());
        System.out.println("Your total score was: " + player.getTotalScore());
        
        GameEntry record = new GameEntry(player.getName(),player.getTotalScore());
        return (record);
    }
    
    
    /**
     * this method clears out the screen... kinda
     * it just adds a lot of blank lines on the screen
     */
    public void clearScreen(){
        for(int i=0; i<50;i++)
            System.out.println("");
    }
}
