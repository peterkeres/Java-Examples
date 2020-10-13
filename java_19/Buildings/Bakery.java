package Buildings;


/**
 * A class that represents a Bakery building.
 */
public class Bakery extends Commercial {


    /**
     * Default constructor for Bakery buildings
     *
     * @param address : the address of the building
     * @param name    : name of the building
     * @param value   : the value of the building
     * @param stories : Number of stories of the building
     * @param forSale : is the building for sale or not
     */
    public Bakery(String address, String name, int value, int stories, boolean forSale) {
        super(address, name, value, stories, forSale);
    }


    /**
     * What services are available at the bakery
     */
    @Override
    public void services() {

        System.out.println("I am a Bakery! We offer the following baked goods:");
        System.out.println("Cookies\nBread\nMuffins");
    }


    /**
     * have the bakery bake something
     */
    public void bake(){
        System.out.println("Ill get to baking!");
    }


}
