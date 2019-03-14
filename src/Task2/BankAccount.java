package Task2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Abstract class BackAccount -
 * This class is the super class with the share characteristics of both types of bank accounts
 * The class also implements the two interfaces relating to bank and customer name functionality.
 * Sub classes may utilise this class for deposit and withdrawal functionality.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public abstract class BankAccount implements Task2.BankInterface, Task2.CustomerNameInterface
{
    // a variable to define the users account number
    private String accountNumber;
    // a variable to define the users name
    private String customerName;
    // a variable to store the users balance
    private double balance;
    // a variable to hold pin number
    private int Pin;
    /**
     * Default constructor.
     * Set {@see #accountNumber} to null.
     * Set {@see #customerName} to null.
     * Set {@see #balance} to 0.
     * Set {@see #Pin} to 0.
     */
    public BankAccount()
    {
        this.accountNumber = null;
        this.customerName = null;
        this.balance = 0;
        this.Pin = 0;
    }

    /**
     * Set {@see #accountNumber}. @param {@link #nameIn}.
     * Set {@see #customerName}. @param {@link #numberIn}.
     * Set {@see #balance}. @param {@link #balanceIn}.
     * Set {@see #Pin}. @param {@link #PinIn}.
     */
    public BankAccount(String nameIn, String accountNumberIn, double balanceIn, int PinIn)
    {
        this.accountNumber = accountNumberIn;
        this.customerName = nameIn;
        this.balance = balanceIn;
        setPin(PinIn);
    }

    /**
     * Set {@see #customerName}. @param {@link #nameIn}.
     */
    public void setCustomerName(String nameIn)
    {
        this.customerName = nameIn;
    }

    /**
     * Set {@see #balance}. @param {@link #balanceIn}.
     */
    public void setBalance(double balanceIn)
    {
        this.balance = balanceIn;
    }

    /**
     * Set {@see #accountNumber}. @param {@link #accountNumberIn}.
     */
    public void setAccountNumber(String accountNumberIn)
    {
        this.accountNumber = accountNumberIn;
    }

    /**
     * Get {@see #customerName}. @param {@link #customerName}.
     */
    public String getCustomerName()
    {
        return customerName;
    }

    /**
     * Get {@see #balance}. @return {@link #balance}.
     * Ensure that when getting the balance it returns within 2 decimal places.
     */
    public double getBalance()
    {
        DecimalFormat df2 = new DecimalFormat(".##");
        return Double.valueOf(df2.format(balance));
    }

    /**
     * Get {@see #accountNumber}. @return {@link #accountNumber}.
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * Check if the pin allocated is exactly 4 digits.
     * Set {@see #Pin}. @param {@link #PinIn}.
     */
    public void setPin(int PinIn)
    {
        if(PinIn > 999 && PinIn < 10000)
        {
            this.Pin = PinIn;
        }
        else {
            System.out.println("Pin needs to be 4 digits long.");
        }
    }

    /**
     * Get {@see #balance}. @return {@link #balance}.
     */
    public int getPin()
    {
        return Pin;
    }

    /**
     * Check the users pin, if correct withdraw the given amount from the users balance.
     *  @param {@link #withdrawIn}.
     *  @param {@link #PinIn}
     */
    public void withdrawl(double withdrawIn, int PinIn)
    {
        // check the pin
        if(PinIn == Pin){
            System.out.println("Your pin is correct.\n You are withdrawing £" + withdrawIn);
            this.balance = balance - withdrawIn;
        }
        else{
            System.out.println("Incorrect pin, please try again.");
        }
    }

    /**
     * Take the users input deposit amount and add it to the balance.
     * @param {@link #depositIn}.
     */
    public void deposit(double depositIn)
    {
        // deposit amount added to the balance
        this.balance = balance + depositIn; // desposit += depositIn
    }

}

