import java.util.Random;

/**
 * Write a description of class Grid here.
 * A grid is a collection of cells
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Grid
{
    private Cell[][] grid;
    private int numberOfBombs;
     /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
        this(10, 10, 10);
    }
    
    public Grid(int rows, int columns, int numberOfBombs)
    {
        grid = new Cell[rows][columns];
        for(int row = 0; row < rows; row++)
        {
            for(int column = 0; column < columns; column++)
            {
                grid[row][column] = new Cell();
            }
        }
        
        // place the bombs
        int nBombs = numberOfBombs;
        while(nBombs > 0)
        {
            Random rnd = new Random();
            int randomRow = rnd.nextInt(rows);
            int randomColumn = rnd.nextInt(columns);
            if(!grid[randomRow][randomColumn].getHasBomb())
            {
                grid[randomRow][randomColumn].setHasBomb(true);
                nBombs--;
            }
            
        }
    }
    
    // Show how many bombs are in the neighborhood
    public String show(int row, int column)
    {
        int bombsInTheHood = 0;
        if(grid[row][column].getHasBomb())
        {
            return "B";
        }
        else
        {
            for(int offsetRow = -1; offsetRow < 2; offsetRow++)
            {
                for(int offsetColumn = -1; offsetColumn < 2; offsetColumn++)
                {
                    try
                    {
                        if(grid[row + offsetRow][ column + offsetColumn].getHasBomb())
                        {
                            bombsInTheHood++;
                        }
                    }
                    catch(IndexOutOfBoundsException e)
                    {
                    }
                }
            }
            return "" + (bombsInTheHood>0?bombsInTheHood:" ");
        }
        //return ""; // Use _ for zero bombs and B for bomb
    }
    
    public String toString()
    {
        String temp = "";
        for(int row = 0; row < grid.length; row++)
        {
            for(int column = 0; column < grid[row].length; column++)
            {
                //temp += grid[row][column].toString();
                temp += show(row, column) + "|";
            }
            temp += "\n";
        }
        return temp;
    }
}
