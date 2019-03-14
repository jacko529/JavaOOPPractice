package Task2;

/**
 * The SavingAccount class - this class is called upon when a saving account object is required.
 * The parametised constructor allows a new object to be set up.
 * A method is included to add a monthly interest to the account if required.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class SavingAccount extends Task2.BankAccount
{

    // variable to hold the interest Rate for a particular user.
    double interestRate;
    /**
     * default constructor
     * sets {@see interestRate} to 0
     */
    public SavingAccount()
    {
        this.interestRate = 0;
    }

    /**
     * Constructor for objects of class Saving account.
     * This is the constructor for the SavingAccount class.
     * Set {@see #accountNumber}. @param {@link #accountNumberIn}.
     * Set {@see #customerName}. @param {@link #nameIn}.
     * Set {@see #balance}. @param {@link #balanceIn}.
     * Set {@see #interestRate}. @param {@link #interestIn}.
     * Set {@see #interestRate}. @param {@link #interestIn}.
     */
    public SavingAccount(String nameIn,String accountNumberIn, double balanceIn, int PinIn, double interestIn) {
        super(nameIn, accountNumberIn, balanceIn, PinIn);
        // Now, setup the fee
        setInterestRate(interestIn);
        if(balanceIn < 0)
        {
            // the balance is set through the super but if this balance is a
            // negative number it is deposited back into the application
            deposit(-balanceIn);
            System.out.println("The balance cannot be set to a negative balance.");
        }
    }

    /**
     * Get {@see #interestRate}. @return {@link #interestIn}.
     * Logic to ensure that the interest rate is a positive number
     * otherwise the variable is not set
     */
    public void setInterestRate(double interestIn)
    {
        if(interestIn < 0 )
        {
            System.out.println("The interest rate cannot be a negative number.");
        }
        else
        {
            this.interestRate = interestIn;
        }
    }

    /**
     * Get {@see #interestRate}. @return {@link #interestRate}.
     */
    public double getInterestRate()
    {
        return interestRate;
    }
    /**
     * overide of the withdrawl method to allow make sure the saving account cannot go overdrawn.
     * @param withdrawIn
     * @param PinIn
     */
    @Override
    public void withdrawl(double withdrawIn, int PinIn)
    {
        if(PinIn == getPin()){
            System.out.println("Your pin is correct.\n You are withdrawing £" + withdrawIn);
            setBalance(getBalance() - withdrawIn);
            if(getBalance() < 0)
            {
                setBalance(getBalance() + withdrawIn);
                System.out.println("Sorry your account cannot go overdrawn.\n Your balance is back to normal.");
            }
        }
        else{
            System.out.println("Incorrect pin, please try again.");
        }
    }

    /**
     * method to add interest rate to current balance.
     * takes the interest rate divides by 100 and adds 1
     * takes the total and multiples by the current balance.
     */
    public void addInterest(){
        setBalance(getBalance()* (getInterestRate()/100+1));
    }

    /**
     * @param balanceIn
     * Applying method overriding to balance method so that the balance cannot be set a negative balance.
     */
    @Override
    public void setBalance(double balanceIn)
    {
        if(balanceIn < 0)
        {
            System.out.println("The balance cannot be set to a negative balance.");
        }
        else
        {
            super.setBalance(balanceIn);
        }
    }
}
