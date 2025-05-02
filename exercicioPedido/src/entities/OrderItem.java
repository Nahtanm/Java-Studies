package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(product.getName() + ", ");
        stringBuilder.append("$ " + product.getPrice() + ", ");
        stringBuilder.append("Quantity: " + quantity + ", ");
        stringBuilder.append("Subtotal: " + subTotal());

        return stringBuilder.toString();
    }

    public Double subTotal(){
        return quantity * price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
