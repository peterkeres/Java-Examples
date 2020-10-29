
package final_project;
import java.text.NumberFormat;
import java.util.Random;

import static acmesorting.ACMESorting.acmeSorting;
import static ajaxsorting.AJAXSorting.AJAXSorting;

/**
 * this is the main class for the final project,
 * it will show all "testing" code i did for each algo,
 * 
 * @author peter keres
 * Date: dec 6 2018
 * f@ck cacner
 */


public class Final_Project {

    public static void main(String[] args) {

        //seeing how each algorithm acts depending on seize of array sent to the
        //comment out if dont want to see the results of that test on the screen
        //complexTest();
        costTest();
        
    }
    
    
    
    /**
     * this method is to test the complexity of each algorithm
     * seeing how they handle arrays of different sizes depending on how large
     * the data being sent to them is
     */
    public static void complexTest(){
        //making 7 test arrays of different size to send to the algo
        int[] test = new int[10];
        int[] test0 = new int[20];
        int[] test1 = new int[50];
        int[] test2 = new int[75];
        int[] test3 = new int[100];
        int[] test4 = new int[250];
        int[] test5 = new int[500];
        int[] test6 = new int[725];
        int[] test7 = new int[1000];
        int[] test8 = new int[5000];
        int[] test9 = new int[10000];
        int[] test10 = new int[50000];
        int[] test11 = new int[100000];
        //an array holding each test array 
        int[][] testArrays = {test,test0,test1,test2,test3,test4,test5,test6,test7,
        test8,test9,test10,test11};
        //populate each array with numbers
        Random rand = new Random();
        for(int i =0; i < testArrays.length; i++){
            for (int j=0; j < testArrays[i].length; j++){
                // to random the values in the array 
                testArrays[i][j] = rand.nextInt(20);
            } 
        }
       
        //send each array to each algo to see how many instructions they use,
        //depending on the size of the array
        for (int k=0; k < testArrays.length; k++){
            //running the acme test
            long acmeTimeS = System.nanoTime();
            int acme = acmeSorting(testArrays[k]);
            long acmeTimeE = System.nanoTime();
            long acmeTimeF = acmeTimeE - acmeTimeS;
            //running the ajax test
            long ajaxTimeS = System.nanoTime();
            int ajax = AJAXSorting(testArrays[k]);
            long ajaxTimeE = System.nanoTime();
            long ajaxTimeF = ajaxTimeE - ajaxTimeS;
            
            //print out the findings of each test
            System.out.println("Size of array is: " + testArrays[k].length);
            System.out.println("Number of instructions for ACME: " + acme);
            System.out.println("Time in nano for ACME: " + acmeTimeF);
            System.out.println("Number of instructions for AJAX: " + ajax);
            System.out.println("Time in nano for AJAX: " + ajaxTimeF);
            
            if (acme > ajax){
                System.out.println("Less instructions: AJAX!");
            }
            else{
                System.out.println("Less instructions: ACME!");
            }
            
            if (acmeTimeF > ajaxTimeF)
                System.out.println("who had the faster time: AJAX");
            else
                System.out.println("who had the faster time: ACME");
            System.out.println();
            System.out.println();
        }
    }
    
    
    /**
     * this method test out the cost of each algorithm in terms of dollars
     */
    public static void costTest (){
        //random test values to see how the cost acts when using both algorithm
        int test = 10;
        int test0 = 20;
        int test1 = 50;
        int test2 = 75;
        int test3 = 100;
        int test4 = 250;
        int test5 = 500;
        int test6 = 725;
        int test7 = 1000;
        int test8 = 5000;
        int test9 = 10000;
        int test10 = 50000;
        int test11 = 100000;  
        
        //numbers based on the daily averages for CSS
        int mon = 10000000;
        int tue = 1000000;
        int wed = 30000000;
        int thr = 50000000;
        int fri = 500000;
        int sat = 100000000;
        int sun = 100000;
        String[] days = {"monday","tuesday","Wednesday","thursday","friday","saturday","sunday"};
        
        int[] testArrays = {test,test0,test1,test2,test3,test4,test5,test6,test7,
        test8,test9,test10,test11};
        int[] testDays = {mon,tue,wed,thr,fri,sat,sun};
        
        
        int acme,ajax;
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        
        //runs each test on each algorithm and displays the price of both and which
        //one is cheaper
        for (int i = 0; i < testArrays.length; i++){
            System.out.println("testing cost for items: " + testArrays[i]);
            acme = acmeCost(testArrays[i]);
            ajax = ajaxCost(testArrays[i]);
            System.out.println("the cost for ACME: " + defaultFormat.format(acme) + "$");
            System.out.println("the cost for AJAX: " + defaultFormat.format(ajax) + "$");
            if (acme > ajax)
                System.out.println("cheaper corp is: AJAX");
            if (acme < ajax)
                System.out.println("cheaper crop is: ACME");
            System.out.println();
            System.out.println();
        }
        
        //runs each test on each algorithm and displays the price of both and which
        //one is cheaper
        //for the days in the week based on the average supplied
        for (int j = 0; j < testDays.length; j++){
            System.out.println("testing day: " + days[j]);
            acme = acmeCost(testDays[j]);
            ajax = ajaxCost(testDays[j]);
            System.out.println("the cost for ACME: " + defaultFormat.format(acme) + "$");
            System.out.println("the cost for AJAX: " + defaultFormat.format(ajax) + "$");
            if (acme > ajax)
                System.out.println("cheaper corp is: AJAX");
            if (acme < ajax)
                System.out.println("cheaper crop is: ACME");
            System.out.println();
            System.out.println();
        }
    }
    
    
    /**
     * this method figures out the cost for the ACME algorithm
     * @param records
     * the number of records you would send ACME
     * @return 
     * the amount of money it would cost 
     */
    public static int acmeCost(int records){
        int cost,request;
        
        request = records;
        //find out which price category it falls into and do the cal for that
        if (request <= 100){
            cost = request * 1;
        }
        else if (request <= 1000){
            cost = request * 700;
        }
        else{
            cost = request * 1300;
        }
        
        return cost;
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
