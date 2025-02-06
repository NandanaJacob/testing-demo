package adapterFactory;

public class PayPalPayment {
    public void pay(double amount) {
        System.out.println("Processing payment of $" + amount + " with PayPal.");
    }
}