
package search_algorithms;

/**
 * this class will handles everything to do with the file importing,
 * first will enter each item into a linked list,
 * take that linked list into an array,
 * then sort the array
 * @author peter keres
 * date: Nov 15 2018
 * f@ck cancer
 */

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class carFile {
    /**
     * this method loads the file, then makes the items into a linked list
     * then will make that list into an array then sorting the array and 
     * deleting the linked list
     * @return 
     * a sorted array based on ID from items found in the file
     */
    public static car[] loadFile() {
            String filePath = "java_23/search_algorithms/cars.csv";
            File file = new File(filePath);
            carLinkedList list = new carLinkedList();
            
        //this section puts the file into a carLinkedList object
        try {
            Scanner inputStream = new Scanner (file);
            // this skips the first line in the file
            inputStream.nextLine();                    
            // goes though each line in the file and splits it into a car object
            while (inputStream.hasNext()){
                String data = inputStream.nextLine();
                String[] values = data.split(",");
                car carAdd = new car(values[0],values[1],values[2],
                values[3],values[4],values[5],values[6],values[7],
                values[8],values[9],values[10],values[11],values[12],
                values[13],values[14],values[15],values[16],values[17]);
                carNode add = new carNode(carAdd,null);
                list.addFirst(add);
            }
            inputStream.close();
            
        // if the file is not found.     
        } catch (FileNotFoundException ex) {
            System.out.println("not find file.");
        }
        
        //sending the linked list to the method to make it an array
        car[] unsortedArray = carFile.mkArray(list);
        
        //sending the array to be sorted based on ID from the
        //compareTO method that was override in car object
        Arrays.sort(unsortedArray);
        
        return unsortedArray;
    }
    
    
    
    /**
     * this method will turn the linked list into a array and delete the linked list
     * @param list
     * is the linked list object 
     * @return 
     * an array of the linked list but not sorted
     */
    public static car[] mkArray(carLinkedList list){
        car[] unSortedArray = new car[list.size];
        int listSize = list.size;
        
       for (int i = 0; i < listSize; i++){
           unSortedArray[i] = list.removeFirst();
       }
       
        return unSortedArray;
    }
    
}
