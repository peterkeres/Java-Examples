package Buildings;


/**
 * A class that represents a Gym building.
 */
public class Gym extends Commercial {


    /**
     * Default constructor for Commercial buildings
     *
     * @param address : the address of the building
     * @param name    : name of the building
     * @param value   : the value of the building
     * @param stories : Number of stories of the building
     * @param forSale : is the building for sale or not
     */
    public Gym(String address, String name, int value, int stories, boolean forSale) {
        super(address, name, value, stories, forSale);
    }


    /**
     * What services are available to the gym
     */
    @Override
    public void services() {
        System.out.println("We offer the following services at the gym:");
        System.out.println("Pool\nYoga\nFree weights");
    }

    /**
     * Time to pump some iron
     */
    public void pumpIron(){
        System.out.println("TIME TO PUMP YOU UP");
    }
}
