
/**
 * Write a description of class Painting here.
 * A painting is well.... a painting! it is a creation made by a creator.
 *
 * @author (Peter Keres)
 * @version (1.0.0)
 */
public class Painting implements Creation
{
    private Creator creator;
    private String title;
    private float width;
    private float height;
    
    /**
     * Constructor for objects of class Painting
     */
    public Painting()
    {
        this(1.0f);
    }
    
    public Painting(float width)
    {
        this(width, 1.0f);
    }
    
    public Painting(float width, float height)
    {
        this(width, height, "No Title");
    }
    
    public Painting(float width, float height, String title)
    {
        this(width, height, title, null);
    }
    
    // Designated Constructor
    public Painting(float width, float height, String title, Creator creator)
    {
        setWidth(width);
        setHeight(height);
        setTitle(title);
        setCreator(creator);
    }
    
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getWidth()
    {
        return width;
    }
    
    public void setHeight(float height)
    {
        this.height = height;
    }
    
    public float getHeight()
    {
        return height;
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
        return CreationType.PAINTING;
    }
}
