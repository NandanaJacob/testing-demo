// InventoryItem.java
import java.io.Serializable;

public class InventoryItem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String itemId;
    private String name;
    private ItemType type;
    private int quantity;
    private boolean stackable;
    
    public InventoryItem(String itemId, String name, ItemType type, boolean stackable) {
        this.itemId = itemId;
        this.name = name;
        this.type = type;
        this.quantity = 1;
        this.stackable = stackable;
    }
    
    public void incrementQuantity() {
        if (stackable) {
            quantity++;
        }
    }
    
    public void decrementQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
    
    // Getters
    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public ItemType getType() { return type; }
    public int getQuantity() { return quantity; }
    public boolean isStackable() { return stackable; }
}
