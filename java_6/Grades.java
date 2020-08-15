
/**
 * work for lab 4 in lesson 5
 * 
 * @author (Peter Keres) 
 * @version (3 / 5 / 2018)
 *f@ck cancer
 */


public class Grades
{
    public static void main(String[] args)
    {
    Student student1 = new Student("Mary");
    //create student2, "Mike"
    Student student2 = new Student("Mike");

    //input grades for Mary
                     student1.inputGrades();

    //print average for Mary
                   System.out.println ("The average for " + student1.getName() + " is " + student1.getAverage() + ".");

    System.out.println();

    //in put grades for Mike
        student2.inputGrades();
    //print average for Mike
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage() + ".");

    }

}
