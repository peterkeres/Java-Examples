
package final_project;
import java.text.NumberFormat;
import java.util.Random;

import static ajaxsorting.AJAXSorting.AJAXSorting;

/**
 *this class shows how i would "handle" each day based on the algorithm of my choice
 * 
 * @author peter keres
 * date: dec 7 2018
 * f@ck cancer
 */
public class CSSSorting {
    public static void main(String[] args) {
        //making an array with the avg number of records that is done on that day
        int[] testMon = new int[10000000];
        int[] testTue = new int[1000000];
        int[] testWed = new int[30000000];
        int[] testThr = new int[50000000];
        int[] testFri = new int[500000];
        int[] testSat = new int[100000000];
        int[] testSun = new int[100000];
        
        int[][] testArrays = {testMon,testTue,testWed,testThr,testFri,testSat,testSun};
        
        //populate each array with numbers
        Random rand = new Random();
        for(int i =0; i < testArrays.length; i++){
            for (int j=0; j < testArrays[i].length; j++){
                // to random the values in the array 
                testArrays[i][j] = rand.nextInt(20);
            } 
        }
        
        //running the sort on each day with the number of avg records that day runs
        CSSSortMonday(testArrays[0]);
        System.out.println();
        System.out.println();
        CSSSortTuesday(testArrays[1]);
        System.out.println();
        System.out.println();
        CSSSortWednesday(testArrays[2]);
        System.out.println();
        System.out.println();
        CSSSortThursday(testArrays[3]);
        System.out.println();
        System.out.println();
        CSSSortFriday(testArrays[4]);
        System.out.println();
        System.out.println();
        CSSSortSaturday(testArrays[5]);
        System.out.println();
        System.out.println();
        CSSSortSunday(testArrays[6]);
        
    }
    
    
    /**
     * this method will simulate what algorithm should be ran on monday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortMonday(int[] values){
        CSSSortDay(values, "MONDAY");
    }
    
    
    /**
     * this method will simulate what algorithm should be ran on tuesday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortTuesday(int[] values){
        CSSSortDay(values, "TUESDAY");
    }
     
     
    /**
     * this method will simulate what algorithm should be ran on wednesday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortWednesday(int[] values){
        CSSSortDay(values, "WEDNESDAY");
    }
      
      
    /**
     * this method will simulate what algorithm should be ran on thursday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortThursday(int[] values){
        CSSSortDay(values, "THURSDAY");
    }
       
     
    /**
     * this method will simulate what algorithm should be ran on friday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortFriday(int[] values){
        CSSSortDay(values, "FRIDAY");
    }
        
    
/**
     * this method will simulate what algorithm should be ran on saturday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */    
    public static void CSSSortSaturday(int[] values){
        CSSSortDay(values, "SATURDAY");
    }
         
     
    /**
     * this method will simulate what algorithm should be ran on sunday to sort
     * the records 
     * @param values
     * the array of records that needs to be sorted
     */
    public static void CSSSortSunday(int[] values){
        CSSSortDay(values, "SUNDAY");
    }


    /**
     * this method will simulate what algorithm should be ran on ANY DAY to sort the records
     * @param values: number of records to sort
     * @param day: day the test is simulating
     */
    public static void  CSSSortDay(int[] values, String day){
        System.out.println("RUNNING SORT FOR " + day);
        System.out.println("sorting " + values.length + " records today.");

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        int inst = AJAXSorting(values);
        int cost = ajaxCost(values.length);

        System.out.println("The records are sorted and took " + inst + " number of instructions");
        System.out.println("The cost would be " + defaultFormat.format(cost));
        System.out.println("ENDING SORT FOR " + day);
    }
    
    
    /**
     * this method figures out the cost for the AJAX algorithm
     * @param records
     * the number of records you would send AJAX
     * @return 
     * the amount of money it would cost
     */
    public static int ajaxCost(int records){
        int cost,request;
        //each request can hold 1000 records, this will hold how many
        //total request we need to send off
        if(records <= 1000)
            request = 1;
        else
            request = records / 1000;
        // if total request are under 100,000 then at one price
        // if more then that at a different price
        if (request <= 100000){
            cost = request * 1000;
        }
        else{
            cost = request * 10000;
        }
        return cost;
    }
}
