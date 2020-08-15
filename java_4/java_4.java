
/**
 * tester for the 8.1 challange part
 * it reads files and counts how many words, characters, and lines are in that file
 *
 * @author (Peter Keres)
 * @version (4 25 2018)
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class java_4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //var i need
        String userFile = "", workingLine = "";
        int totalChar=0, totalWord=0, totalLine=0, lineLen = 0;
        Character workingLetter = ' ';
        boolean nextFile = true;
        
        
        
        //objects
        Scanner scan = new Scanner(System.in);
        
        
    while (nextFile){
            try{
            //getting file name from user
            System.out.println("Please Enter a file name.");
            userFile = scan.next();
            
            
            FileReader fileStream = new FileReader(userFile);       // to figure out what file i need to look at
            Scanner scanF = new Scanner(fileStream);                // to let me look at each line in that file
                
                //counting the car, words, and lines in this file
                while (scanF.hasNextLine())
                {
                    //what line im working on 
                    workingLine = scanF.nextLine();
                    
                    //getting the lenght of the line im working on 
                    lineLen = workingLine.length();
                    
                    //finding all the car
                    
                    for (int i =0; i < lineLen; i++)
                    {
                            workingLetter = workingLine.charAt(i);
                            if (Character.isSpaceChar(workingLetter))      // looks for a space, if a space is not there then there is a char there
                                {}
                            else
                                totalChar = totalChar + 1;
                    }
                    
                    //finding number of words
                    for(int j=0; j < lineLen; j++)
                    {
                        workingLetter = workingLine.charAt(j);
                        if (Character.isSpaceChar(workingLetter))          //if there is a space then i know a work was just before it
                            totalWord = totalWord + 1;
                    }
                    //the last word would not have a space behind it 
                    totalWord = totalWord + 1;
                    
                    //finding number of lines
                    totalLine = totalLine + 1;
                }
            //letter the use know that file was ok
            System.out.println("Found it.");
            }
            // if there is no file like that on the computer, to show totals 
             catch (FileNotFoundException A)
             {
                System.out.print("total number of characters is: " + totalChar + "\t" + "total number of words are: " +  totalWord + "\t" + "Total number of lines are: " + totalLine);
                nextFile = false;
              }
    }
            
    
}
   
}

