
package search_algorithms;

/**
 * this class will hold all methods for any type of "menu" call on the screen,
 * examples would be a main menu that prints out options,
 * this will handle user validation
 * @author peter keres
 * date: nov 15 2018
 * f@ck cancer
 */

import java.util.Scanner;
       
public class menu {

    /**
     * this method will print out the main menu choices for the user,
     * will take there input and see if it is valid from the choices
     * @return 
     * a int with the value of what choice they picked from the menu
     */
    public static int mainMenu(){
        System.out.println("PLEASE PICK FROM THE FOLLOWING OPTIONS.");
        System.out.println("1: Seeing every car in the list.");
        System.out.println("2: Find a car in the list by linear search.");
        System.out.println("3: Find a car in the list by Binary search.");
        System.out.println("4: Quit the program.");
        
        Scanner scan = new Scanner(System.in);
        String user = scan.next();
        int menuC = 0;
        boolean pass = true;
        
        //tests to see if the user input is a number and also
        //checks to see if it is in the range of 1 - 4
        do{
            try {
                menuC = Integer.parseInt(user);
                pass = true;
                if(menuC > 4 || menuC < 1){
                    System.out.println("Please enter a number in the range above.");
                    user = scan.next();
                    pass = false;
                }
            }catch(NumberFormatException e){
                System.out.println("Please enter in only numbers, Example 1 or 2.");
                user = scan.next();    
                pass = false;    
            }
        }while(pass == false);
        
        return menuC;
    }
    
    /**
     * this method will run the menu option 1 of printing every item in the file
     * will only show the id of each car item
     * @param array 
     * the array of car objects that was grabbed from the file
     */
    public static void menu1(car[] array){
        for (car array1 : array) {
             System.out.println(array1.ID);
         }
        
    }
    
    /**
     * this method will run the menu option 2 of finding a item in the list,
     * using a linear search
     * @param array 
     * the array of car objects that was grabbed from the file
     */
    public static void menu2(car[] array){
        System.out.println("what is the car ID you are looking for?");
        Scanner scan = new Scanner(System.in);
        String userPick = scan.nextLine();
        
        car target = new car(null,null,null,null,null,null,null,null,null,userPick,
        null,null,null,null,null,null,null,null);
        
        long timeStart = System.nanoTime();
        SearchMethods.linearSearch(array, 0, array.length, target);
        long timeEnd = System.nanoTime();
        long timeFinal = timeEnd - timeStart;
        System.out.println("and it took " + timeFinal + " nano seconds");
        
    }
    
    
    /**
     * this method will run the menu option 2 of finding a item in the list,
     * using a binary search
     * @param array 
     * the array of car objects that was grabbed from the file
     */
    public static void menu3(car[] array){
        System.out.println("what is the car ID you are looking for?");
        Scanner scan = new Scanner(System.in);
        String userPick = scan.nextLine();
        
        car target = new car(null,null,null,null,null,null,null,null,null,userPick,
        null,null,null,null,null,null,null,null);
        
        long timeStart = System.nanoTime();
        SearchMethods.binarySearch(array, 0, array.length, target);
        long timeEnd = System.nanoTime();
        long timeFinal = timeEnd - timeStart;
        System.out.println("and it took " + timeFinal + " nano seconds");
    }
    
}
