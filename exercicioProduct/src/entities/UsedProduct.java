package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate date;

    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }

    @Override
    public String priceTag() {
        return getName() + " (Used) $ " + getPrice() + " (Manufacture date:" + date + ")";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
