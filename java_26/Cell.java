
/**
 * Write a description of class Cell here.
 * A cell is one unit of the grid that can hold a bomb.
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Cell
{
    private boolean hasBomb;
    private boolean flagged;

    /**
     * Constructor for objects of class Cell
     */
    public Cell()
    {
        hasBomb = false;
        flagged = false;
    }
    
    public void setHasBomb(boolean hasBomb)
    {
        this.hasBomb = hasBomb;
    }
    
    public boolean getHasBomb()
    {
        return hasBomb;
    }
    
    public void setFlagged(boolean flagged)
    {
        this.flagged = flagged;
    }
    
    public boolean getFlagged()
    {
        return flagged;
    }
    
    public String toString()
    {
        return "|" + (hasBomb?"B":" ") + "|";
    }
}
