import Buildings.Bakery;
import Buildings.Bank;
import Buildings.Building;
import Buildings.Gym;

public class main {

    public static void main(String[] args) {

        System.out.println("Creating a Bank, Gym, and bakery");

        Building bank = new Bank("110 greenfield", "All green bank", 1222, 2, false);
        Building gym = new Gym("on the corner", "Golds gym", 10, 1, true);
        Building bakery = new Bakery("some place", "Crispy biscuits", 100, 3, false);


        System.out.println("\n"+bank);
        ((Bank) bank).services();

        System.out.println("\n"+gym);
        ((Gym) gym).services();

        System.out.println("\n"+bakery);
        ((Bakery) bakery).services();

        System.out.println("Done!");
    }
}
