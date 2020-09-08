
/**
 * Fighter class
 *
 */
public class Fighter extends Character
{
    //Instance variables
    private String weapon;
    private int damage;

    /**
     * default constructor for fighter
     * @param name Name of fighter
     * @param hitPoints Total hit points of fighter
     * @param weapon Weapon the fighter is using
     * @param damage damage the weapon does
     */
    public Fighter(String name,int hitPoints,String weapon, int damage){
        super(name, hitPoints);
        this.weapon = weapon;
        this.damage = damage;
    }

    /**
     *
     * @return Name of Weapon
     */
    public String getWeapon() {
        return this.weapon;
    }

    /**
     *
     * @return Amount of damge done by weapon
     */
    public int getDamage() {
        return this.damage;
    }


    @Override
    public String toString() {
        return "Fighter{" +
                "weapon='" + getWeapon() + '\'' +
                ", damage=" + getDamage() +
                ", name='" + super.getName() + '\'' +
                ", hitPoints=" + super.getHitPoints() +
                '}';
    }
}
