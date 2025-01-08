// Customer.java
import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String customerId;
    private String name;
    private String email;
    // Marked as transient to prevent serialization of sensitive data
    private transient String password;
    private double accountBalance;
    private String accountType;
    
    public Customer(String customerId, String name, String email, 
                   String password, double accountBalance, String accountType) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }
    
    @Override
    public String toString() {
        return "Customer{" +
               "customerId='" + customerId + '\'' +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", accountBalance=" + accountBalance +
               ", accountType='" + accountType + '\'' +
               '}';
    }
    
    // Getters and setters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getAccountBalance() { return accountBalance; }
    public String getAccountType() { return accountType; }
}

// SecurityUtil.java
// CustomerSerializer.java
// SecureCustomerStorage.java

// Main.java
