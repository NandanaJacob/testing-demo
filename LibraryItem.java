import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class LibraryItem implements Serializable{
    protected String title;
    protected double price;
    protected boolean availability;

    public LibraryItem(String title, double price) {
        this.title = title;
        this.price = price;
        this.availability = true;
    }

    public abstract String getItemType();
    
    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isAvailable() { return availability; }
    public void setAvailability(boolean availability) { this.availability = availability; }
}