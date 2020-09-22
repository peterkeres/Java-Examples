/**
 * BankAccount class
 */

public class BankAccount
{
    // instance variables
    float balance;
    String owner;
   

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(float balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }


    /**
     * returns the current balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     *
     * @return the owner of account
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Withdraws the specified amount only if if won't create a negative 
     * balance
     */
    public float withdraw(float wAmount){
        if (getBalance() - wAmount < 0){
            throw new ArithmeticException("Can not withdraw amount, would bring account lower then 0");
        }
        else{
            balance = balance - wAmount;
        }

        return  wAmount;
    }
    
    /**
     * Adds the amount to the current balance
     */
    public void addBalance(float deposit){
        if (deposit <= 0){
            throw new ArithmeticException("Can not Deposit a non-positive value");
        }
        else{
            balance += deposit;

        }
     }
    
    /**
     * returns a string representation of the account
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + getBalance() +
                ", owner='" + getOwner() + '\'' +
                '}';
    }
}
