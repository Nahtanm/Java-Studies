package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private LocalDate date;
    private Double amount;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return date.format(dateTimeFormatter) + " - " + String.format("%.2f", amount);
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

}
