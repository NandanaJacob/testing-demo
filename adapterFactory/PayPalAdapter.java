package adapterFactory;

// Adapter for PayPal
public class PayPalAdapter implements PaymentGateway {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(double amount) {
        payPalPayment.pay(amount);  // Adapting PayPal to PaymentGateway interface
    }
}