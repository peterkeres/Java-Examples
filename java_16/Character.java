
/**
 * Character Class
 *
 */
public class Character
{
    //Instance variables
    protected String name;
    protected int hitPoints;

    /**
     * Default constructor
     * @param name Name of the character
     * @param hitPoints Current health of the character
     */
    public Character(String name, int hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
    }

    /**
     *
     * @return Name of the character
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return Current Hit points
     */
    public int getHitPoints(){
        return this.hitPoints;
    }


    /**
     * Adds hit points to the character
     * @param health hit points to be added
     */
    public void addHitPoints(int health){
        this.hitPoints+= health;
    }

    /**
     * remove hit points
     * @param damage the hit points to be removed
     */
    public void removeHitPoints(int damage){
        this.hitPoints-= damage;
    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + getName() + '\'' +
                ", hitPoints=" + getHitPoints() +
                '}';
    }
}
