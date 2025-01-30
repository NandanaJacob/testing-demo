package mod8;

public class Order {
    private Integer id;
    private String name;
    private Double price;
    private Double orderedQuantity;

    public Order(Integer id, String name, Double price, Double orderedQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.orderedQuantity = orderedQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(Double orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }
}

