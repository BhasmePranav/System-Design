package LowLevelDesign.solidprinciples.liskovsubstitutionprinciple;

/* LSP : Liskov Substitution principle states that each subsclass should  replace its parent class 
 * without breaking code and actual working of parent
*/
public class PaymentServices {

    public static void main(String[] args) {

        Payment pay1 = new UPIPayment();
        pay1.Pay(5000);

        pay1 = new CreditCardPayment();
        pay1.Pay(2000);

        IsEligiblePayment pay2 = new LoyaltyPointPayment();
        pay2 = new LoyaltyPointPayment();
        if(pay2.isEligible(700))
        {
            pay1.Pay(700);
        }
        
    }

}

/* form below subclasses we can replace parent calss with UPI and credit card but we cant replace it with 
 * loyalty point bcz it is not following LSP
 */

class UPIPayment implements Payment
{

    @Override
    public void Pay(double amount) {
        System.out.println("AMount paid by UPI payment : "+amount);
    }
    
}

class CreditCardPayment implements Payment
{

    @Override
    public void Pay(double amount) {
        System.out.println("AMount paid by Credit card payment : "+amount);
    }
    
}


/* in this class we have restriction that we cant pay more than 1000 amount using loyalty points
 * so here if amount is greater than 1000 then we cant pay and it is breaking liskov substitution principle
 * so to avoid this we are using another interface which will check that is it eligible to pay or not
 * if yes then we procees else not
 */
class LoyaltyPointPayment implements IsEligiblePayment
{
    @Override
    public boolean isEligible(double amount) {
        return amount <= 1000;
    }

    @Override
    public void Pay(double amount) {
        //if(amount <= 1000)  System.out.println("Cant pay this much :");
       System.out.println("AMount paid by Loyalty payment : "+amount);
    }
    
    
}

