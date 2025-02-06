package adapterFactory;

// Adapter Factory
public class PaymentAdapterFactory {

    public static PaymentGateway getPaymentGateway(String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("Stripe")) {
            return new StripeAdapter(new StripePayment());
        } else if (paymentMethod.equalsIgnoreCase("PayPal")) {
            return new PayPalAdapter(new PayPalPayment());
        }
        throw new IllegalArgumentException("Unknown payment method");
    }
}

