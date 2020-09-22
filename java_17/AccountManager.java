import java.util.Scanner;

/**
 * AccountManager class
 */
public class AccountManager
{


    public static void main(String[] args) {
        AccountManager acc = new AccountManager();
        BankAccount checking = new Checking(200.00f, "James", 200);
        BankAccount saving = new Savings(400.00f, "Sam", 4.2f);

        while(true){
            acc.userActions(checking, saving);
        }

    }

    /**
     * Prints menu and gets actions from user
     * @param checking: The checking account
     * @param saving: the savings account
     */
    public void userActions(BankAccount checking, BankAccount saving){
        int choice = menu();

        switch (choice){
            case 1:
                deposit(saving);
                break;
            case 2:
                deposit(checking);
                break;
            case 3:
                withdraw(saving);
                break;
            case 4:
                withdraw(checking);
                break;
            case 5:
                System.out.println(saving);
                break;
            case 6:
                System.out.println(checking);
                break;
            case 7:
                System.out.println("Quiting program");
                System.exit(0);
                break;
        }
    }

    /**
     * Deposits an amount into an account
     * @param account: The account that is getting the deposit
     */
    public void deposit(BankAccount account){
        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to deposit?");
        float amount = scan.nextFloat();

        account.addBalance(amount);
    }

    /**
     * Withdraws an amount out of an account
     * @param account: The account that is getting the withdraw
     */
    public void withdraw(BankAccount account){
        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to withdraw?");
        float amount = scan.nextFloat();

        account.withdraw(amount);

    }

    /**
     * Prints out the menu to the user and gets the action choice
     * @return the choice action the users wants to do
     */
    public int menu(){
        System.out.println("Please select from the following menu options:\n" +
                "1: Deposit to Savings\n" +
                "2: Deposit to Checking\n" +
                "3: Withdraw from Savings\n" +
                "4: Withdraw from Checking\n" +
                "5: Print Savings Balance\n" +
                "6: Print Checking Balance\n" +
                "7: Quit");

        return userChoice();
    }

    /**
     * Gets the users choice and checks that its valid
     * @return The users choice of action
     */
    public int userChoice(){
        Scanner scan = new Scanner(System.in);
        int user= 0;
        boolean accept;

        do {
            try {
                System.out.print("\nSELECTION:::");
                accept = true;
                user = scan.nextInt();
                if (user < 1 || user > 7){
                    System.out.println("That selection is outside the range, try again");
                    accept = false;
                }
            }
            catch (Exception e){
                System.out.println("That was not a correct choice, please try again");
                accept = false;
                scan.next();
            }
        }while (!accept);

        return user;
    }

}
