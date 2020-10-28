
package search_algorithms;

/**
 * this is the final main for the program of search algorithms
 * 
 * @author peter keres
 * date: nov 15 2018
 * 
 * f@ck cancer
 */


public class Search_algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         car[] array = carFile.loadFile();
        int userPick;
        do{
            userPick = menu.mainMenu();
            
            if (userPick == 1)
                menu.menu1(array);
            else if(userPick ==2)
                menu.menu2 (array);
            else if (userPick == 3)
                menu.menu3(array);
                
        }while(userPick < 4);
        
        System.out.println("GoodBuy");
    }
    
}
