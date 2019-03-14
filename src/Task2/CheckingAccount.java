package Task2;


/**
 * The CheckingAccount class - this class is called upon when a checking account object is required.
 * The parametised constructor allows a new account to be set up.
 * The feault constructor may be called if an accounts requires to utilsie the
 * individual methods.
 * A method is included to add a monthly fee to the account if required.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class CheckingAccount extends Task2.BankAccount
{
    // variable to hold the fee the account charges.
    private double fee;
    /**
     * default constructor for the checking acccount class
     * set's {@see #fee} to 0.
     */
    public CheckingAccount()
    {
        fee = 0;
    }

    /**
     * Constructor for objects of class CheckingAccount
     * Set {@see #customerName}. @param {@link #nameIn}.
     * Set {@see #accountNumber}. @param {@link #accountNumberIn}.
     * Set {@see #balance}. @param {@link #balanceIn}.
     * Set {@see #fee}. @param {@link #feeIn}.
     */
    public CheckingAccount(String nameIn, String accountNumberIn, double balanceIn,int PinIn, double feeIn )
    {
        super(nameIn, accountNumberIn, balanceIn, PinIn);
        // Now, setup the fee
        setFee(feeIn);
    }
    /**
     * Set {@see #fee}. @param {@link #feeIn}.
     * logic to make sure the initial fee is not a negative number.
     */
    public void setFee(double feeIn)
    {
        if(feeIn < 0)
        {
            System.out.println("The initial fee can only be a positive number. ");
        }
        else
        {
            this.fee = feeIn;
        }
    }

    /**
     * Get {@see #fee}. @return {@link #fee}.
     */
    public double getFee()
    {
        return fee;
    }

    /**
     * Method to subtract fee from the balance of the account.
     * The method calls the setBalance method and substracts the given fee of the
     * instanace .
     */
    public void subtractFee()
    {
        setBalance(getBalance() - fee);
    }
}
