package LowLevelDesign.oops.EncapsulationDemo;

public class BankAccount {
    

    /* for achieving abstraction we are providing all data members private so it cant be modified directly */
    private String name;
    private String accountumber;
    private double balance;

    public BankAccount(String name, String accountumber, double balance)
    {
        this.name = name;
        this.accountumber = accountumber;
        this.balance = balance;

    }
    /* providing only getters not setters so that we cant directly update these values */
    public String getName()
    {
        return this.name;
    }
    
    public String getAccountNumber()
    {
        return this.accountumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void seeBalance()
    {
        System.out.println("Balance is : "+balance);
    }

    public void deposit(double amount)
    {
        System.out.println("Deposited : "+amount);
        balance += amount;
        seeBalance();
    }

    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            System.out.println("withdraw : "+amount);
            balance -= amount;
        }
        else
        {
            System.out.println("You have insufiecient balance. ");
        }
        seeBalance();
    }


}
