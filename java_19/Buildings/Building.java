package Buildings;

/**
 * Interface for any class that repeats a building
 */
public interface Building {

    /**
     * Gets the street address of the building
     * @return: Street address
     */
    public String getAddress();

    /**
     * Gets the property value of the Building
     * @return: property value
     */
    public int getValue();

    /**
     * Gets the number of stores tall the Building is
     * @return: number of stories
     */
    public int getStories();

    /**
     * Gets the name of the building
     * @return: The name of the building
     */
    public String getName();

    /**
     * IF the building is currently for sale or not
     * @return: T for able to be sold
     */
    public boolean isForSale();

}
