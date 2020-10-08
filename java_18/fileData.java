import java.util.ArrayList;

/**
 * holds and searches the data from the file
 */
public class fileData {


    // instance variables
    ArrayList<String> titles;
    ArrayList<String[]> records;


    /**
     * default constructor
     */
    public fileData() {
        this.titles = new ArrayList<String>();
        this.records = new ArrayList<String[]>();
    }


    /**
     * Adds titles to the object storage
     * @param titles: The line from file that holds all the titles
     */
    public void addTitles(String titles){

        String titleSplit[] = titles.split(",");

        for (String section : titleSplit ) {
            this.titles.add(section);
        }
    }


    /**
     * Adds the records to the object storage
     * @param records: A line record from the file that holds data points
     */
    public void addRecord(String records){

        String record[] = records.split(",");
        record[0] = record[0].replace("\"", "");
        this.records.add(record);
    }


    /**
     * Finds a record in the storage
     * @param county: the country of the record you want to find
     * @return the record of country found
     */
    public String[] findRecord(String county){
        String[] found = null;

        for (String[] record : records ) {

            if (record[0].equalsIgnoreCase(county)){
                found = record;
                break;
            }
        }

        return found;
    }


    /**
     * Finds a record based on a happiness rating
     * @param happiness: the value of happiness you want to find
     * @return The record found
     */
    public String[] findRecord(int happiness){

        String[] result = null;

        for (String[] record:records) {

            if (Integer.parseInt(record[1]) == happiness){
                result = record;
                break;
            }
        }

        return result;
    }


    @Override
    public String toString() {
        return "fileData{" +
                "titles=" + titles +
                ", records=" + records +
                '}';
    }
}
