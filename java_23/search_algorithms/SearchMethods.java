
package search_algorithms;

/**
 * this will hold the 2 search methods used
 binary SearchMethods and linear SearchMethods
 * 
 * @author peter Keres
 * date: Nov 16 2018
 * f@ck cancer
 */


public class SearchMethods {

    
    /**
     * will look though each item in the array trying to find the target item,
     * then prints the time it took to the screen and the item found
     * @param <T>
     * the object type of the array
     * @param data
     * the array it self
     * @param min
     * the start of the array
     * @param max
     * the last item of the array
     * @param target
     * the object you are looking for
     * @return
     * returns a true if found, false if other wise
     */
    public static <T extends Comparable<T>> boolean linearSearch
            (T[] data, int min, int max,T target){
                
                for (int i = min; i < max; i++){
                    
                    if (data[i].compareTo(target) == 0){
                        System.out.println("Found the item!");
                        System.out.println(data[i]);
                        return true;
                    }
                }
                System.out.println("Didnt find item");
                return false;
            }
            
            
     /**
      * will look for a target item in the array with a binary search
      * @param <T>
      * the type of objects in the array 
      * @param data
      * the array 
      * @param min
      * the start point of the array 
      * @param max
      * the last element of the array 
      * @param target
      * the object that you are looking for 
      * @return 
      * true if it is found, false otherwise
      */       
     public static <T extends Comparable<T>> boolean binarySearch
            (T[] data, int min, int max,T target){
                
            int midpoint = (min + max) / 2;
            
                if(!(midpoint >= max)){
                    if (data[midpoint].compareTo(target) == 0){
                        System.out.println("found the item!");
                        System.out.println(data[midpoint]);
                        return true;
                    }
                    else if (data[midpoint].compareTo(target) > 0){
                        if (min <= midpoint -1)
                            return binarySearch(data,min,midpoint -1,target);
                    }
                    else if (midpoint +1 <= max){
                        return binarySearch(data,midpoint+1,max,target);
                    }

                }

                System.out.println("didnt find item");
                return false;
            }
}
