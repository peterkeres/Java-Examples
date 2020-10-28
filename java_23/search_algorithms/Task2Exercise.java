
package search_algorithms;

/**
 * this is the main that will run / answer the questions for task 2 of assigment 3 only
 * will use only a few other classes and require no user input just show results
 * @author peter keres
 * date: nov 19 2018
 * f@ck cancer
 */

import java.util.Random;

public class Task2Exercise {
    
    public static void main(String[] args){
      
      test(10);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");
      test(50);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");
      test(100);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");
      test(200);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");  
      test(500);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");  
      test(700);
      System.out.println("************");
      System.out.println("************");
      System.out.println("NEW SEARCH NUMBER");
      System.out.println("************");
      System.out.println("************");
      test(1000);
      
    }
    
    
    
    
    public static void test(int num){
        
        car [] array = carFileTask2.loadFile(num);
        Random rand = new Random();
        
        int rand1 = rand.nextInt(num);
        System.out.println("looking for item " + array[rand1].ID + "with a array size of " + num);
        
        // does a linear search on the array
        long timeStart = System.nanoTime();
        SearchMethods.linearSearch(array, 0, array.length, array[rand1]);
        long timeEnd = System.nanoTime();
        long timeFinal = timeEnd - timeStart;
        System.out.println("With a linear search it took " + timeFinal + " nano seconds");
        
        // does a binary search on the array
        long timeStart2 = System.nanoTime();
        SearchMethods.binarySearch(array, 0, array.length, array[rand1]);
        long timeEnd2 = System.nanoTime();
        long timeFinal2 = timeEnd2 - timeStart2;
        System.out.println("With a binary search it took " + timeFinal2 + " nano seconds");
    }
    
    /**
     ***************************************************************************
     * *************************************************************************
     *                             CONCLUSION
     * 
     *      It is pretty clear that the binary search is a much faster way to search.
     * once the size in the array starts to get bigger the time gap between the two
     * searches increases very fast. If the number for the array was to keep growing
     * past the tests ive done here, im sure the trend will continue and speed 
     * of the binary search will grow even more in comparison to the linear search.
     *
     * 
     * ***************************************************************************
     * *************************************************************************
     */
}
