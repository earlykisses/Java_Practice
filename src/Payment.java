import java.util.Scanner;

// Abstract class
abstract class PaymentMethod {
    abstract void pay(double amount);
}

// Subclasses
class CreditCardPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class DebitCardPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

class UPIPayment extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();

        System.out.println("1. Credit Card\n2. Debit Card\n3. UPI");
        System.out.print("Choose payment method: ");
        int choice = sc.nextInt();

        PaymentMethod payment = null;

        if (choice == 1) payment = new CreditCardPayment();
        else if (choice == 2) payment = new DebitCardPayment();
        else if (choice == 3) payment = new UPIPayment();
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        payment.pay(amount);
        sc.close();
    }
}
