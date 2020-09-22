
/**
 * Savings account class
 */

public class Savings extends BankAccount
{
    //Instance variables
    float interest;
    

    /**
     * Constructor for objects of class Savings
     */
    public Savings(float balance, String owner, float interest) {
        super(balance, owner);
        this.interest = interest;
    }

    /**
     * add the calculated interest to the current balance
     */
    public void addInterest(){
        addBalance( (getBalance()* interest) );
    }
    
     /**
     * Change the current interest rate
     */
    public void setInterest(float interest) {
        this.interest = interest;
    }

    /**
     * Returns a string representation a savings account
     */
    @Override
    public String toString() {
        return "Savings{" +
                "interest=" + interest +
                ", balance=" + super.getBalance() +
                ", owner='" + super.getOwner() + '\'' +
                '}';
    }
}
