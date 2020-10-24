package Game;

/** This class will be the Game.card objects for the Game.deck in the Game.blackJackGame class
 * it will hold information about each Game.card such as value and art
 * 
 * @author pete keres
 * date 10-27
 * f@ck cancer
 */


public class card {
   
    protected int value = 0;
    protected String suite = null;
    protected String face = null;
    
    
    /**
     * This constructor method will take in 2 parm and will also give us the 
     * value on the Game.card used to compare who has the better hand
     * if the value == -1 then a face value was sent that was not apart of a,
     * 52 Game.card Game.deck
     * @param face
     * this will be the "face value" of the Game.card,
     * example "10" == 10 "A" == 11
     * @param suite
     * will be the suite of the Game.card, only pass the first letter of the suite,
     * example "H" == hearts, "C" clubs
     */
    public card (String face,String suite){
        this.face = face;
        this.suite = suite;
        
        switch (face){
            case "2":
                this.value = 2;
                break;
            case "3":
                this.value = 3;
                break;
            case "4":
                this.value = 4;
                break;
            case "5":
                this.value = 5;
                break;
            case "6":
                this.value = 6;
                break;    
            case "7":
                this.value = 7;
                break;    
            case "8":
                this.value = 8;
                break;  
            case "9":
                this.value = 9;
                break;    
            case "10":
                this.value = 10;
                break;    
            case "J":
                this.value = 10;
                break;    
            case "Q":
                this.value = 10;
                break;    
            case "K":
                this.value = 10;
                break;    
            case "A":
                this.value = 11;
                break;    
            default:
                this.value = -1;
                break;
        }
    }
    
    /**
     * 
     * @return
     * is the cards value in int form,
     * used to compare this with another Game.card
     */
    public int getValue (){
        return (value);
    }
    /**
     * 
     * @return
     * will be the suite of the Game.card, but will only be the first letter
     */
    public String getSuite(){
        return (suite);
    }
    
    /**
     * 
     * @return 
     * this is the face value of the Game.card, example "K" or "2"
     */
    public String getFace (){
        return (face);
    }
    
    
    /**
     * this will print out the font art of the Game.card,
     * the values on the Game.card will change for each Game.card object
     */
    public void frontArt (){
        System.out.println(" ---------");
        System.out.println("|" + face + "        |");
        System.out.println("|         |");
        System.out.println("| "+ suite +" "+ suite +" "+ suite +" "+ suite +" |");
        System.out.println("|         |");
        System.out.println("|        " + face + "|");
        System.out.println(" ---------");
    }
    
    /**
     * this will print the back art of the Game.card to the screen,
     * this will be the same for every Game.card object
     */
    public void backArt (){
        System.out.println(" ---------");
        System.out.println("| "+"*"+" "+"*"+" "+"*"+" "+"*"+" |");
        System.out.println("|"+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+"|");
        System.out.println("| "+"*"+" "+"*"+" "+"*"+" "+"*"+" |");
        System.out.println("|"+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+"|");
        System.out.println("| "+"*"+" "+"*"+" "+"*"+" "+"*"+" |");
        System.out.println(" ---------");
    }
}
