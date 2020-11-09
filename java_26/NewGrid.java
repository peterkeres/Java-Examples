
import java.util.Random;

/**
 * A grid is a collection of cells
 * This new version of grid uses the new cells
 *
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class NewGrid
{
    private int rows;
    private int columns;
    private NewCell entry;
    /**
     * Constructor for objects of class NewGrid
     */
    public NewGrid()
    {
        this(10, 10, 10);
    }

    public NewGrid(int rows, int columns, int numberOfBombs)
    {
        NewCell[][] grid = new NewCell[rows][columns];
        for(int row = 0; row < rows; row++)
        {
            for(int column = 0; column < columns; column++)
            {
                grid[row][column] = new NewCell();
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
        //Build the grid (maybe with scaffolding as in the original Grid)

        //Connect the cells
        entry = grid[0][0];
        for(int row = 0; row < rows; row++)
        {
            for(int column = 0; column < columns; column++)
            {
                //System.out.println("Row: " + row + ", Column: " + column);
                for(int index = 0; index < 8; index++)
                {
                    try
                    {
                        grid[row][column].setNeighbor(grid[row - computeColumnOffset((index + 2) % 8)][column + computeColumnOffset(index)], Direction.values()[index]);
                    }
                    catch(IndexOutOfBoundsException e)
                    {
                    }
                }
            }
        }

        //Place the bombs
    }

    private static int computeColumnOffset(int ordinal)
    {
        if(ordinal == 0 || ordinal == 4)
        {
            return 0;
        }
        if(ordinal < 4)
        {
            return 1;
        }
        return -1;
    }
    
    //we send this function the number of the row and column of the cell to open
    //NOTE we are starting at 1 for column and row.
    //NOTE this function also assumes the cell is not currently flaged
    // will return ture if we can keep plyaing, false if we lose.
    public boolean open(int row, int column)
    {
        // holds the current spot of the linked list travel 
        NewCell currentCell = new NewCell();
        currentCell = entry;
        
        //getting on the right row
        for (int i=2; i<= row; i++)
        {
            currentCell = currentCell.getNeighbor(Direction.S);
        }
       
        
        //getting on the right column
        for (int i=2; i<= column; i++)
        {
            currentCell = currentCell.getNeighbor(Direction.E);
        }
        
        // the currentCell is the spot we want to open!
        currentCell.open();

        // goes to each of its neighors and drops the first wave of the open area bomb?
        for(int index = 0; index < 8; index++)
        {
            openArea(currentCell.getNeighbor(Direction.values()[index]));
        }             
        
        return !currentCell.getHasBomb();
    }
    
    
    //this method will create a 'wave' of opening effects in the cells when givin a start base position
    
    private static void openArea (NewCell base)
    {
        //if the passing base happns to be null, we stop
        try{
            // this makes it so the 'wave' doesnt come back in on its self/ checks only cells that need to be opened
            if (base.getCellState() == CellState.CLOSED )
            {
                // as long as thier is not a bomb, we open the base cell
                if (!base.getHasBomb() )
                {
                     base.open();
                     // we are only seeing off another 'wave' if there are no bombs surronding this cell
                     if (base.bombsInHood() == 0)
                     {
                        for(int index = 0; index < 8; index++)
                        {
                            // we only send off a new 'wave' to a cell that is not null
                            if ( !(base.getNeighbor(Direction.values()[index]) == null))
                            {
                                openArea( base.getNeighbor(Direction.values()[index]));
                            }
                        }
                     }
                }    
            }
        }
        catch(NullPointerException e)
        {
        }
        
    }
       
    //we send this function the number of the row and column of the cell to
    //      change the state of flagged or not
    //NOTE we are starting at 1 for column and row.
    public void flag(int row, int column)
    {
        // holds the current spot of the linked list travel 
        NewCell currentCell = new NewCell();
        currentCell = entry;
        
        //getting on the right row
        for (int i=2; i<= row; i++)
        {
            currentCell = currentCell.getNeighbor(Direction.S);
        }
       
        
        //getting on the right column
        for (int i=2; i<= column; i++)
        {
            currentCell = currentCell.getNeighbor(Direction.E);
        }
        
        // the currentCell is the spot we want to change state of the flag!
        currentCell.flag();
    }

    public String toString()
    {
        return entry.print();
    }
}
