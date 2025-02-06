package adapterFactory;

// Client Code
public class PaymentProcessor {

    public static void main(String[] args) {
        // Using the Factory to get a specific Payment Gateway Adapter
        PaymentGateway stripeGateway = PaymentAdapterFactory.getPaymentGateway("Stripe");
        stripeGateway.processPayment(100.00);  // Output: Processing payment of $100.0 with Stripe.

        PaymentGateway paypalGateway = PaymentAdapterFactory.getPaymentGateway("PayPal");
        paypalGateway.processPayment(200.00);  // Output: Processing payment of $200.0 with PayPal.
    }
}
