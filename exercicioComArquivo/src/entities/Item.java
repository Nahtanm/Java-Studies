package entities;

public class Item {

    private String name;
    private Double price;
    private Integer quantity;

    public Item(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item() {
    }

    public Double subTotal(){
        return this.price * quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

}
