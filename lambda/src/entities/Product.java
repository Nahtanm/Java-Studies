package entities;

import java.util.Objects;

public class Product {

    private String name;
    private Double price;

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product " +
                 name + ", "+ price
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
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
}
