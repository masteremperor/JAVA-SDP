//Abstract class
public class Tester {
    public static void main(String[] args) {
        // Test for CreditCardPayment
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.balance = 5000.0;
        System.out.println("Credit Card Payment Test 1:");
        creditCardPayment.payBill(6000.0);

        CreditCardPayment creditCardPayment2 = new CreditCardPayment();
        creditCardPayment2.balance = 3000.0;
        System.out.println("\nCredit Card Payment Test 2:");
        creditCardPayment2.payBill(2000.0);

        // Test for ShoppingPayment
        ShoppingPayment shoppingPayment = new ShoppingPayment();
        shoppingPayment.balance = 1000.0;
        System.out.println("\nShopping Payment Test 1:");
        shoppingPayment.payBill(1000.0);

        ShoppingPayment shoppingPayment2 = new ShoppingPayment();
        shoppingPayment2.balance = 1500.0;
        System.out.println("\nShopping Payment Test 2:");
        shoppingPayment2.payBill(1200.0);

        ShoppingPayment shoppingPayment3 = new ShoppingPayment();
        shoppingPayment3.balance = 2000.0;
        System.out.println("\nShopping Payment Test 3:");
        shoppingPayment3.payBill(2500.0);
    }
}

// RRPaymentServices.java
abstract class RRPaymentServices {
    protected double balance;

    public abstract void payBill(double amount);
}

// CreditCardPayment.java
class CreditCardPayment extends RRPaymentServices {
    private static int counter = 2000; // starting point for paymentID
    private double cashBack;
    private double balanceDue;

    @Override
    public void payBill(double amount) {
        if (amount >= balance) {
            cashBack = amount - balance;
            counter++;
            System.out.println("Payment Successful! Your Payment ID: C" + counter);
            System.out.println("Cashback: " + cashBack);
        } else {
            balanceDue = balance - amount;
            System.out.println("Payment Successful! Your Payment ID: C" + counter);
            System.out.println("Remaining Balance Due: " + balanceDue);
        }
    }
}

// ShoppingPayment.java
class ShoppingPayment extends RRPaymentServices {
    private static int counter = 1000; // starting point for paymentID

    @Override
    public void payBill(double amount) {
        if (amount == balance) {
            counter++;
            System.out.println("Payment Successful! Your Payment ID: S" + counter);
        } else {
            System.out.println("Invalid payment amount. Please enter the correct amount.");
        }
    }
}