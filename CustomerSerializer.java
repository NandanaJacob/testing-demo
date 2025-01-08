import java.io.*;

public class CustomerSerializer {
    public static byte[] serializeCustomer(Customer customer) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(customer);
            return baos.toByteArray();
        }
    }
    
    public static Customer deserializeCustomer(byte[] data) 
            throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (Customer) ois.readObject();
        }
    }
}
