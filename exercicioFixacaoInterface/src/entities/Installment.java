package entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate date;
    private Double amount;

    public Installment(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return date + " - " + String.format("%.2f", amount);
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

}
