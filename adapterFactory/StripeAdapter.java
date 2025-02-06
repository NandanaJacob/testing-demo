package adapterFactory;

// Adapter for Stripe
public class StripeAdapter implements PaymentGateway {
    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void processPayment(double amount) {
        stripePayment.makePayment(amount);  // Adapting Stripe to PaymentGateway interface
    }
}