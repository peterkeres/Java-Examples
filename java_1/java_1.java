
/**
 * the tester class for lab 8.1 about file reading
 *
 * @author (Peter Keres)
 * @version (4 25 2018)
 * f@ck cancer
 */

import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //var i need
        int count = 1;
        String currentLine = "";
        
        //objects
        FileReader read = new FileReader("java_1/input.txt");      //to read the lines in the file
        Scanner scanF = new Scanner(read);                                  //so i can use the lines in the file
        PrintWriter outFile = new PrintWriter("java_1/output.txt");  //lets me make an output file and write too it
        
        
        // read the file , writing to the new file
        do{
            currentLine = scanF.nextLine();
            outFile.println("/*" + count + "*/ " + currentLine);
            System.out.println("count:" + count +"\t" +  currentLine);
            count = count + 1;
        }while (scanF.hasNextLine());
        
        outFile.close();        // this closes the output file
        System.out.println("Done.");     // to let user know its done
            
    }
}
