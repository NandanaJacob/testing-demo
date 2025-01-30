package mod8;

public class EpaymentPayment implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double billAmount) {
        // Add 5% charge for e-payment
        return billAmount + (billAmount * 0.05);
    }

    @Override
    public void processPaymentDetails() {
        // Collect cash card details like card name (Paypal, Paytm), card number, expiry date
        System.out.println("Enter Cash Card Name (e.g., PayPal, Paytm), Card Number, Expiry Date");
    }
}

