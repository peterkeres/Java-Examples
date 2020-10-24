package Game;
/**
 * this will hold the main function for programming assignment 2
 * this will act as a "main menu" for the game
 * allowing us to call the black jack game function and a see highs score function
 * @author peter keres
 * date 10-29
 * f@ck cancer
 */

import Double_Linked_List.HiScoresDLL;

import java.util.*;
import java.io.*;


public class mainMenu {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        blackJackGame game = new blackJackGame();
        HiScoresDLL scoreList = new HiScoresDLL();
        boolean finish = false;
        String userChoice = null;
        
        // here is the main menu, that will repeat until they enter a 3
        while (!finish){
            System.out.println("Hello and welcome to the title screen for blackJack!");
            System.out.println("please select from the following options:");
            System.out.println("1: play a new game.");
            System.out.println("2: see high scores.");
            System.out.println("3: quit the game.");
            userChoice = scan.next();
            
            while (!(userChoice.equals("1")) & !(userChoice.equals("2")) & !(userChoice.equals("3"))){
                System.out.println("Sorry, please enter a 1, 2, or a 3");
                userChoice = scan.next();
            }
            //plays 5 rounds with one Game.player
            if (userChoice.equals("1")){
                scoreList.add(game.start());
            }
            //shows all the scores that have happened so far
            else if (userChoice.equals("2")){
                System.out.println("here are the list of high scores in descending order:");
                scoreList.display();
            }
            else
                finish = true;
            System.out.println();
            System.out.println();
        }
        
        
        //prints to a score list file each Game.player and there score
        try{
            PrintWriter outFile = new PrintWriter("Java_22/Game/Score List.txt");
            for (int i =1; i <= scoreList.size;i++){
                outFile.println(scoreList.getNode(i).entry.toString());
            }
            outFile.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
}
