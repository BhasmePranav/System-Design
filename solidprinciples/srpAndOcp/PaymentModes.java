package LowLevelDesign.solidprinciples.srpAndOcp;

//THIS APPLICATION SHOWS SINGLE RESPONSIBIITY AND OPEN FOR EXTENSION AND CLOSED FOR MODIFICATION PRINCIPLE
public class PaymentModes {

    public static void main(String[] args) {
        
        /*creating object of credit card class with refrence to PaymentMEthod interface bcz user will not depend on 
         * concrete class he just kno fucntionality
         * 
         * object of any class with referecne to interface PaymentMethod says thaat
         * it can hold obbject of any class which implements that interface
         */
        PaymentMethod ccp = new CreditCardPayment();
        ccp.pay(5000);

        /* here we can change object of another claass bcz we have referece to interface if there was refrnce eith same class
         * we cannot update that object to another class
         */
        ccp = new PayPalPayment();
        ccp.pay(1000);

    }
}


/* here creating saperate class for each payment method instead of creating single class and adding all methods ther
 * bcz to follow OCP and SRP principles
 * OCP principle says that open for extension and close for modification when we want to add new payment method here we need to add extra class
 * but in single we need to modify that class. SRP says that each class shoudl perform single repsonsibility 
 */
class CreditCardPayment implements PaymentMethod
{

    @Override
    public void pay(int amount) {
       System.out.println("Amount debiited from Credit card : "+amount);
    }
}

class UPIPayment implements PaymentMethod
{

    @Override
    public void pay(int amount) {
        System.out.println("Amount debiited from UPI : "+amount);
    }
}

class PayPalPayment implements PaymentMethod
{

    @Override
    public void pay(int amount) {
        System.out.println("Amount debiited from PayPal account : "+amount);
    }
}
