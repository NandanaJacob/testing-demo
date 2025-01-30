package mod8;
import java.util.List;

public class Bill {
    private Integer billNumber;
    private String customerName;
    private List<Order> orderList;  // List of orders
    private Double billAmount;
    private Double finalAmount;
    private PaymentStrategy paymentStrategy; // Payment strategy is now part of Bill

    public Bill(Integer billNumber, String customerName, List<Order> orderList, Double billAmount) {
        this.billNumber = billNumber;
        this.customerName = customerName;
        this.orderList = orderList;
        this.billAmount = billAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void calculateFinalAmount() {
        this.finalAmount = paymentStrategy.calculateFinalAmount(this.billAmount);
    }

    public void processPaymentDetails() {
        paymentStrategy.processPaymentDetails();
    }

    public Double getFinalAmount() {
        return finalAmount;
    }
}
