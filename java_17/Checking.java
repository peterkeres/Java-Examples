
/**
 * Checking account class
 */

public class Checking extends BankAccount
{
    //instance variables
    private int numChecks;

    /**
     * Constructor for objects of class Checking
     */
    public Checking(float balance, String owner, int numChecks) {
        super(balance, owner);
        this.numChecks = numChecks;
    }

    /**
     * Withdraws an amount and reduces the number
     * of checks by 1
     */
    @Override
    public float withdraw(float wAmount) {
        numChecks -= 1;
        return super.withdraw(wAmount);
    }

    /**
     * Returns the number of checks
     */
    public int getNumChecks() {
        return numChecks;
    }

    /**
     * Increases the number of checks by the number ordered
     */
    public void addChecks(int checks){
        if (checks <= 0){
            throw new ArithmeticException("Enter in a positive number of checks to be added");
        }
        else{
            numChecks += checks;
        }
    }
    
     /**
     * Returns a string representation of a checking account
     */
    @Override
    public String toString() {
        return "Checking{" +
                "numChecks=" + numChecks +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
