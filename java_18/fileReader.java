import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * object that reads a file, processes the data, and launches the menu to interact with the file
 */
public class fileReader {


    // instance variables
    String path;
    fileData data;


    /**
     * default constructor
     * @param path: the path to the file to be open
     */
    public fileReader(String path){
        this.path = path;
        this.data = new fileData();
    }


    /**
     * Reads and processes the file
     */
    public void readFile(){

        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            // processes the titles
            line = br.readLine();
            data.addTitles(line);

            // processes all the data records
            line = br.readLine();
            while ( line != null){
                data.addRecord(line);
                line = br.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Prints out the menu to the user and runs actions accordingly
     */
    public void menu(){

        while (true){
            System.out.println("1:\tFind happiness rank of a country");
            System.out.println("2:\tFind all country's with a happiness rank");
            System.out.println("3:\tQuit");

            userAction();
        }

    }


    /**
     * retrieves the action from the user and run it
     */
    public void userAction(){

        Scanner scan = new Scanner(System.in);

        int user = scan.nextInt();

        switch (user){
            case 1:
                action1(scan);
                break;
            case 2:
                action2(scan);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("That is not within the choice list, try again.");
        }

    }


    /**
     * Runs processes of getting happiness rank of a country
     * @param scan: scanner object to grab user input
     */
    private void action1(Scanner scan){

        System.out.print("Enter the name of the county you wish to see the happiness rank of:");
        String userCounty = scan.next();

        String[] searchResult = data.findRecord(userCounty);

        if(searchResult != null){
            System.out.println("The happiness rank of "+ searchResult[0]+ "is: " + searchResult[1]);
        }
        else{
            System.out.println("Could not find the country of "+userCounty);
        }

    }


    /**
     * Runs processes of getting a country with a happiness rank
     * @param scan: scanner object to grab user input
     */
    private void action2(Scanner scan){

        System.out.println("Enter in a happiness rank between 1 and 155");
        int userHappiness;

        try{
            userHappiness = scan.nextInt();

            if ( (userHappiness < 1)  || (userHappiness > 155) ){
                throw new IllegalArgumentException("out or range");
            }

            String[] record = data.findRecord(userHappiness);

            if (record != null){
                System.out.println("Following county have that happiness rank: " + record[0]);
            }

        }
        catch (InputMismatchException e){
            System.out.println("Please enter in a number");
        }
        catch (IllegalArgumentException e){
            System.out.println("ERROR: that value is out of the range 1 - 155");
        }

    }

}
