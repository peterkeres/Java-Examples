# Lab Assignment Writing Your Own Class

### A teacher wants a program to keep track of grades for students and decides to create a student class for his program as follows: 

* Each student will be described by three pieces of data: his/her name, his/her score on test #1, and his/her score on test #2. 
* There will be one constructor, which will have one argument—the name of the student. 
* There will be three methods: getName, which will return the student's name; inputGrades, which will prompt for and read in the student's test grades; and getAverage, which will compute and return the student's average. 

1. File Student.java contains an incomplete definition for the Student class. Save it to your directory and complete the class definition as follows: 

2. Add a method named toString to your Student class that returns a string containing the student's name and test scores, e.g.:  Name: Joe  Test1: 85  Test2: 91  
   Note that the toString method does not call System.out.println—it just returns a string. Recompile your Student class and the Grades program (you shouldn't have to change the Grades program—you don't have to call toString explicitly). Now see what happens when you print a student object—much nicer! 

3. File Grades.java contains a tester program that declares two Student objects. Complete this program. You need to use the inputGrades method to read in each student's test scores, then use the getAverage method to find their average. Print the average with the student's name, e.g., "The average for Joe is 87." You can use the  getName method to print the student's name. 