package Buildings;


/**
 * A class that represents a Bank building
 */
public class Bank extends Commercial {


    /**
     * Default constructor for Commercial buildings
     *
     * @param address : the address of the building
     * @param name    : name of the building
     * @param value   : the value of the building
     * @param stories : Number of stories of the building
     * @param forSale : is the building for sale or not
     */
    public Bank(String address, String name, int value, int stories, boolean forSale) {
        super(address, name, value, stories, forSale);
    }


    /**
     * What Services are available at the building
     */
    @Override
    public void services() {
        System.out.println("I am a bank, we have the following services:");
        System.out.println("Deposits\nLoans\nChecks");
    }

    /**
     * Taking out a loan?
     */
    public void loan(){
        System.out.println("SHOW ME THE MONEYYYY");
    }



}
