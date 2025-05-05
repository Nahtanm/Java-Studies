package entities;

import java.time.LocalDateTime;

public class UsedProduct extends Product {

    private LocalDateTime date;

    public UsedProduct(String name, Double price, LocalDateTime date) {
        super(name, price);
        this.date = date;
    }

    @Override
    public String priceTag() {
        return getName() + "(Used) $ " + getPrice() + "(Manufacture date:" + date + ")";
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
