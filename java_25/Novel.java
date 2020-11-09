
/**
 * Write a description of class Novel here.
 * A novel is a book that someone has 'created'
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Novel implements Creation
{
    private Creator creator;
    private String title;
    private int nPages;
    /**
     * Constructor for objects of class Novel
     */
    public Novel()
    {
        this(1);
    }
    
    public Novel(int nPages)
    {
        this(nPages, "No Title");
    }
    
    public Novel(int nPages, String title)
    {
        this(nPages, title, null);
    }
    
    // Designated Constructor
    public Novel(int nPages, String title, Creator creator)
    {
        setNPages(nPages);
        setTitle(title);
        setCreator(creator);
    }
    
    public void setNPages(int nPages)
    {
        this.nPages = nPages;
    }
    
    public int getNPages()
    {
        return nPages;
    }

    public Creator getCreator()
    {
        return creator;
    }
    
    public void setCreator(Creator creator)
    {
        this.creator = creator;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public CreationType getType()
    {
        return CreationType.NOVEL;
    }
}
