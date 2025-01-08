// Inventory.java
import java.io.Serializable;
import java.util.*;

public class Inventory implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Map<String, InventoryItem> items;
    private int maxCapacity;
    private int currentCapacity;
    
    public Inventory() {
        this.items = new HashMap<>();
        this.maxCapacity = 20;
        this.currentCapacity = 0;
    }
    
    public boolean addItem(InventoryItem item) {
        if (currentCapacity >= maxCapacity) {
            return false;
        }
        
        String itemId = item.getItemId();
        if (items.containsKey(itemId)) {
            items.get(itemId).incrementQuantity();
        } else {
            items.put(itemId, item);
            currentCapacity++;
        }
        return true;
    }
    
    public boolean removeItem(String itemId) {
        InventoryItem item = items.get(itemId);
        if (item == null) {
            return false;
        }
        
        item.decrementQuantity();
        if (item.getQuantity() <= 0) {
            items.remove(itemId);
            currentCapacity--;
        }
        return true;
    }
    
    public Map<String, InventoryItem> getItems() { return items; }
}
