/**
 * Midterm
 *
 * @Name
 * @Date
 */

import java.util.Scanner;

public class Game
{

    // Instance Variables
    Fighter fighter;
    Wizard wizard;
    Scanner scan;

    public static void main(String[] args){
        Game game = new Game();

        game.playGame();
    }


    /**
     * Runs the game
     */
    private void playGame(){
        this.createCharacters();
        scan = new Scanner(System.in);

        System.out.print(startMessage());

        while ( !winner() ){
            newRound();
        }

        outComeText();
    }

    /**
     * Creates the characters for the game
     */
    private void createCharacters(){
        this.fighter = new Fighter("Warrior", 22, "Axe", 10);
        this.wizard = new Wizard("Mage", 12, "FireBall", 10);

    }

    /**
     *
     * @return The starting message for the game
     */
    private String startMessage(){
        return "Welcome to the small fighting simulator!\n"+
                "We have " + this.fighter.getName() + " VS " + this.wizard.getName() + "\n"+
                "You will be playing the roll of the " + this.fighter.getName();
    }

    /**
     * To check to see if there is a winner or not
     * @return is a winner or not
     */
    private boolean winner(){
        return this.fighter.getHitPoints() <= 0 || this.wizard.getHitPoints() <= 0 ? true : false ;
    }

    /**
     * Runs one round of fighting
     */
    private void newRound(){
        // The fighters action
        int fighterAction = playerAction();
        switch (fighterAction){
            case 1:
                wizard.removeHitPoints(fighter.getDamage());
                System.out.println("You hit the Wizard with your " + fighter.getWeapon()+"!!");
                break;
            case 2:
                fighter.removeHitPoints(100);
                System.out.println("Your running away!, for the best i hope!");
                break;
        }

        // the wizards action
        if (!winner()){
            fighter.removeHitPoints(wizard.getSpellDamage());
            System.out.println("O no, the wizard hit you with " + wizard.getSpell()+".");
        }
    }

    /**
     *
     * @return What action the player wants to take
     */
    private int playerAction(){
        boolean accept = false;
        int user = 0;

        do {
            System.out.println("You have the following actions:\n1:\tAttack\n2:\tRun Away");
            try {
                user = scan.nextInt();
                if ( user < 1 || user > 2){
                    throw new IndexOutOfBoundsException("Out of action range");
                }
                accept = true;
            }
            catch (Exception e ){
                System.out.println("That was not a correct choice, please try again");
                scan.next();
            }

        }while(!accept);

        return user;
    }

    /**
     * The final text on the outcome on the fight
     */
    private void outComeText(){
        if (fighter.getHitPoints() < 0){
            System.out.println("Looks like the wizard got the better of you!");
        }
        else{
            System.out.println("You have defeated the wizard! NICE!!!!");
        }
    }
}
