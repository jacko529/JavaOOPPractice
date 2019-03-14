package Task2;


/**
 * Bank Interface Class
 *
 * This class is the method signature for the
 * withdrawal and deposit of transactions.
 *
 *
 * @author Jack Churchill
 * @version 1.0
 */
public interface BankInterface
{
    /**
     *
     * @param  depositIn the amount the user wants to deposit in
     */
    public void deposit(double depositIn);

    /**
     *
     * @param  withdrawalIn the amount the user wants to withdraw
     * @param PinIn the users 4 digit pin
     */
    public void withdrawl(double withdrawalIn,int PinIn);
}
