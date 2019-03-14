package Task2;


/**
 * The test class for the bank account class.
 *
 * @author Jack Churchill
 * @version 1.0
 */
public class bankAccountTest
{
    public static void main(String args[])
    {
        // instance variables - replace the example below with your own
        //  SavingAccount ASavingAccountTest = new SavingAccount("Jack Churchill", "343434", -3.00, 2532, 3.3);

          /*
        System.out.println ("The testing value of InterestRate is :" + ASavingAccountTest.getInterestRate());
        System.out.println ("The testing value of Pin is :" + ASavingAccountTest.getPin());
        System.out.println ("The testing value of CustomerName is :" + ASavingAccountTest.getCustomerName());
        System.out.println ("The testing value of Balance is :" + ASavingAccountTest.getBalance());
        System.out.println ("The testing value of AccountNumber is :" + ASavingAccountTest.getAccountNumber());
   /*

       // CheckingAccount ACheckingAccountParameterised = new CheckingAccount("Dave Churchill", "34345", 3.00, 2536, 5.00);
      //  SavingAccount ASavingAccountParameterised = new SavingAccount("Jack Churchill", "343434", 3.00, 2532, 3.3);
        System.out.println ("The initial value of fee is :" + ACheckingAccountDefault.getFee());
        // saving account values parameterised

        // checking account values parameterised
        System.out.println ("The parameterised value of Fee is :" + ACheckingAccountParameterised.getFee());
        System.out.println ("The parameterised value of Pin is :" + ACheckingAccountParameterised.getPin());
        System.out.println ("The parameterised value of CustomerName is :" + ACheckingAccountParameterised.getCustomerName());
        System.out.println ("The parameterised value of Balance is :" + ACheckingAccountParameterised.getBalance());
        System.out.println ("The parameterised value of AccountNumber is :" + ACheckingAccountParameterised.getAccountNumber());
        */



        /*
        // saving account values default
        System.out.println ("The default value of InterestRate is :" + ASavingAccountDefault.getInterestRate());
        System.out.println ("The default value of Pin is :" + ASavingAccountDefault.getPin());
        System.out.println ("The default value of CustomerName is :" + ASavingAccountDefault.getCustomerName());
        System.out.println ("The default value of Balance is :" + ASavingAccountDefault.getBalance());
        System.out.println ("The default value of AccountNumber is :" + ASavingAccountDefault.getAccountNumber());
        // checking account values default
        System.out.println ("The default value of Fee is :" + ACheckingAccountDefault.getFee());
        System.out.println ("The default value of Pin is :" + ACheckingAccountDefault.getPin());
        System.out.println ("The default value of CustomerName is :" + ACheckingAccountDefault.getCustomerName());
        System.out.println ("The default value of Balance is :" + ACheckingAccountDefault.getBalance());
        System.out.println ("The default value of AccountNumber is :" + ACheckingAccountDefault.getAccountNumber());




        // interest
        System.out.println ("The initial value of fee is :" + ASavingAccountDefault.getInterestRate());
        ASavingAccountDefault.setInterestRate(4.00);
        System.out.println ("The value of fee after being set : " + ASavingAccountDefault.getInterestRate() + "\n");

        SavingAccount ASavingAccountDefault = new SavingAccount();
        CheckingAccount ACheckingAccountDefault = new CheckingAccount();
        // saving account
        System.out.println ("The initial value of interest rate is :" + ASavingAccountDefault.getInterestRate());
        ASavingAccountDefault.setInterestRate(-2.00);
        System.out.println ("The value of interest rate after being set : " + ASavingAccountDefault.getInterestRate() + "\n");
        // checking account
         System.out.println ("The initial value of fee is :" + ACheckingAccountDefault.getFee());
        ACheckingAccountDefault.setFee(-40.00);
        System.out.println ("The value of fee after being set : " + ACheckingAccountDefault.getFee() + "\n");


        // accountNumber
        /*
        System.out.println ("The initial value of accountNumber is :" + ASavingAccountDefault.getAccountNumber());
        ASavingAccountDefault.setAccountNumber("232434");
        System.out.println ("The value of accountNumber after being set : " + ASavingAccountDefault.getAccountNumber() + "\n");
        ASavingAccountDefault.setAccountNumber("98764783");
        System.out.println ("The new value of accountNumber after being set : " + ASavingAccountDefault.getAccountNumber() + "\n");
        // customerName
        /*
        System.out.println ("The initial value of customerName is :" + ASavingAccountDefault.getCustomerName());
        ASavingAccountDefault.setCustomerName("Jack Churchill");
        System.out.println ("The value of customerName after being set : " + ASavingAccountDefault.getCustomerName() + "\n");
        // balance

         // Pin
        System.out.println ("The initial value of Pin is :" + ASavingAccountDefault.getPin());
        ASavingAccountDefault.setPin(3432);
        System.out.println ("The value of Pin after being set : " + ASavingAccountDefault.getPin() + "\n");
         */

        Task2.CheckingAccount ACheckingAccount = new Task2.CheckingAccount("j5498", "Jack C", 1203.34, 3465,5.00);
        System.out.println ("The checking account balance is " + ACheckingAccount.getBalance());
        // deposit 100
        ACheckingAccount.deposit(100);
        // withdraw and give correct pin
        // ACheckingAccount.withdrawl(1498.20, 3465);
        // subtract the 5 pound fee
        //ACheckingAccount.subtractFee();
        // display the final balance
        System.out.println ("The new checking account balance is " + ACheckingAccount.getBalance());


        Task2.SavingAccount aSavingAccount = new Task2.SavingAccount("j5498", "Jack C", 100.00,7865, 5.00 );
        System.out.println ("The saving account balance is " + aSavingAccount.getBalance());
        aSavingAccount.deposit(100);
        //aSavingAccount.withdrawl(1150.0, 7865);
        //aSavingAccount.addInterest();
        System.out.println ("The new saving account balance is " + aSavingAccount.getBalance());
    }
}
