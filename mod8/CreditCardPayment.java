package mod8;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public double calculateFinalAmount(double billAmount) {
        // No extra charge for Credit Card payments
        return billAmount;
    }

    @Override
    public void processPaymentDetails() {
        // Collect credit card details like card number and expiry date
        System.out.println("Enter Credit Card Number and Expiry Date");
    }
}
