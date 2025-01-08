//import java.io.*;
import javax.crypto.SecretKey;
import java.nio.file.*;
//import java.util.Base64;

public class SecureCustomerStorage {
    private final SecretKey encryptionKey;
    private final String storagePath;
    
    public SecureCustomerStorage(String storagePath) throws Exception {
        this.storagePath = storagePath;
        this.encryptionKey = SecurityUtil.generateKey();
        
        // Save the encryption key securely
        saveEncryptionKey();
    }
    
    public void saveCustomer(Customer customer) throws Exception {
        // First serialize the customer object
        byte[] serializedData = CustomerSerializer.serializeCustomer(customer);
        
        // Then encrypt the serialized data
        byte[] encryptedData = SecurityUtil.encrypt(serializedData, encryptionKey);
        
        // Save encrypted data to file
        String filename = customer.getCustomerId() + ".dat";
        Path filePath = Paths.get(storagePath, filename);
        Files.write(filePath, encryptedData);
    }
    
    public Customer loadCustomer(String customerId) throws Exception {
        String filename = customerId + ".dat";
        Path filePath = Paths.get(storagePath, filename);
        
        // Read encrypted data from file
        byte[] encryptedData = Files.readAllBytes(filePath);
        
        // Decrypt the data
        byte[] decryptedData = SecurityUtil.decrypt(encryptedData, encryptionKey);
        
        // Deserialize back to Customer object
        return CustomerSerializer.deserializeCustomer(decryptedData);
    }
    
    private void saveEncryptionKey() throws Exception {
        String keyString = SecurityUtil.keyToString(encryptionKey);
        Path keyPath = Paths.get(storagePath, "encryption.key");
        Files.write(keyPath, keyString.getBytes());
    }
    
    private SecretKey loadEncryptionKey() throws Exception {
        Path keyPath = Paths.get(storagePath, "encryption.key");
        String keyString = new String(Files.readAllBytes(keyPath));
        return SecurityUtil.stringToKey(keyString);
    }
}