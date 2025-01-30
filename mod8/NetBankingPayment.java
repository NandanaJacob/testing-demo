package mod8;

public class NetBankingPayment implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double billAmount) {
        // Add 2.5% charge for net banking
        return billAmount + (billAmount * 0.025);
    }

    @Override
    public void processPaymentDetails() {
        // Collect bank details like bank name, account number, IFSC code
        System.out.println("Enter Bank Name, Account Number, IFSC Code");
    }
}

