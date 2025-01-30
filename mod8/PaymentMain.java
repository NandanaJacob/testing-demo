package mod8;

import java.util.ArrayList;
import java.util.List;

public class PaymentMain {
    public static void main(String[] args) {
        //sample orders
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "Laptop", 50000.00, 1.0));
        orderList.add(new Order(2, "Phone", 20000.00, 2.0));

        Bill bill = new Bill(101, "John Doe", orderList, 90000.00);

        //Credit Card strategy:
        bill.setPaymentStrategy(new CreditCardPayment());

        bill.calculateFinalAmount();
        System.out.println("Final Amount: " + bill.getFinalAmount());

        bill.processPaymentDetails();

        //NetBankingPayment strategy:
        System.out.println("\nChanging to NetBankingPayment...");
        bill.setPaymentStrategy(new NetBankingPayment());

        bill.calculateFinalAmount();
        System.out.println("Final Amount: " + bill.getFinalAmount());

        bill.processPaymentDetails();

        //EpaymentPayment strategy:
        System.out.println("\nChanging to EpaymentPayment...");
        bill.setPaymentStrategy(new EpaymentPayment());

        bill.calculateFinalAmount();
        System.out.println("Final Amount: " + bill.getFinalAmount());

        bill.processPaymentDetails();
    }
}
