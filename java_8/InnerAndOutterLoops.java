
/**
 * Write a description of class InnerAndOutterLoops here.
 *
 * @author (Peter Keres)
 * @version (2/2/2018)
 */
public class InnerAndOutterLoops
{
    public static void main(String[] args)
    {
    int position = 1;
    int sum = 0;
    int count = 0;
    
    
    //adding the total
    while (position < 101)
    {
        //To count up each totals
        do
        {
            count = count + 1;           
            sum = sum + count;
        } while ( count < position);
        
        System.out.println("The sum of positive integers from 1 to " + position + " is " + sum);
        // zeroing out each total to start back over
        sum = 0;
        count = 0;
        position = position + 1;
    }
}
}
