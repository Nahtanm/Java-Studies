package entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private Double valuPerHour;
    private Integer hours;

    public HourContract(LocalDate date, Double valuPerHour, Integer hours) {
        this.date = date;
        this.valuPerHour = valuPerHour;
        this.hours = hours;
    }

    public HourContract() {
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuPerHour=" + valuPerHour +
                ", hours=" + hours +
                '}';
    }

    public Double totalValue(){
        return hours * valuPerHour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuPerHour() {
        return valuPerHour;
    }

    public void setValuPerHour(Double valuPerHour) {
        this.valuPerHour = valuPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
