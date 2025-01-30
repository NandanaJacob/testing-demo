package mod8;

public interface PaymentStrategy {
    public double calculateFinalAmount(double billAmount);
    public void processPaymentDetails(); // Method to collect details required for payment
}
