package LowLevelDesign.oops.EncapsulationDemo;

public class Payment {

    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("Pranav", "123456789", 500);


        //not giving direct acccess to modify balance field using deposit and withdraw method
        account1.seeBalance();
        account1.deposit(1000);
        account1.withdraw(700);
        account1.deposit(1000);
        account1.withdraw(2100);
    }
	
}
