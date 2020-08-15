
/**
 * workd for lab 4 lesson 5
 * 
 * @author (Peter Keres) 
 * @version (3 / 5 / 2018)
 * f@ck cancer
 */

import java.util.Scanner;


public class Student
{
   private String name;
   private double test1;
   private double test2;
   

    public Student(String studentName)
    {
        name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter " + name + "'s score for test 1:");
    test1 = scan.nextDouble();

    System.out.print("Enter " + name + "'s score for test 2:");
    test2 = scan.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
        double avg;
        
        avg = (test1 + test2) / 2;
        
        return avg;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String getName()
    {
        return name;
    }

    
    public String toString()
    {
        return "Student: " + name + " Test1: " + test1 + " Test2: " + test2;
        
    }
}
