import java.util.HashMap;

/**
 * Write a description of class NewCell here.
 * is a cell that can hold bombs. Can also keep track of the cells around it
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class NewCell
{
    private CellState state;
    private boolean hasBomb;
    //private boolean flagged;
    //private boolean open;
    private HashMap<Direction, NewCell> hood;
    /**
     * Constructor for objects of class NewCell
     */
    public NewCell()
    {
        state = CellState.CLOSED;
        hasBomb = false;
        //flagged = false;
        //open = false;
        hood = new HashMap<Direction, NewCell>();
    }

    public int bombsInHood()
    {
        int counter = 0;
        for(NewCell cell : hood.values())
        {
            counter += cell.getHasBomb()?1:0;
        }
        return counter;
    }
    
    public void setNeighbor(NewCell cell, Direction direction)
    {
        hood.put(direction, cell);
    }
    
    public NewCell getNeighbor(Direction direction)
    {
        return hood.get(direction);
    }

    public void setHasBomb(boolean hasBomb)
    {
        this.hasBomb = hasBomb;
    }

    public boolean getHasBomb()
    {
        return hasBomb;
    }

    public void flag()
    {
        switch(state)
        {
            case CLOSED:
            state = CellState.FLAGGED;
            break;
            case OPEN:
            break;
            case FLAGGED:
            state = CellState.CLOSED;
            break;
        }
    }
    
    public void open()
    {
        switch(state)
        {
            case CLOSED:
            state = CellState.OPEN;
            break;
            case OPEN:
            break;
            case FLAGGED:
            break;
        }
    }

    //changed what closed looks like, it was messing me up
    public String toString()
    {
        int nBombs = bombsInHood();
        return (state==CellState.OPEN?(hasBomb?"█":nBombs==0?" ":Integer.toString(nBombs)):state==CellState.FLAGGED?"F":"*");
    }
    
    public String print()
    {
        return printRow() + (getNeighbor(Direction.S) == null?"":getNeighbor(Direction.S).print());
        /*
        if(getNeighbor(Direction.S) == null)
        {
            return printRow();
        }
        else
        {
            return printRow() + getNeighbor(Direction.S).print();
        }
        */
    }
    
    private String printRow()
    {
        return toString() + "|" + (getNeighbor(Direction.E) == null?"\n":getNeighbor(Direction.E).printRow());
        /*
        if(getNeighbor(Direction.E) == null)
        {
            return toString() + "|" + "\n";
        }
        else
        {
            return toString() + "|" + getNeighbor(Direction.E).printRow();
        }
        */
    }
    
    public CellState getCellState()
    {
        return this.state;
    }
    
}
