package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer numberContract;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installment;

    public Contract(Integer numberContract, LocalDate date, Double totalValue) {
        this.numberContract = numberContract;
        this.date = date;
        this.totalValue = totalValue;
        this.installment = new ArrayList<>();
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }


    public List<Installment> getInstallment() {
        return installment;
    }

    public void addInstallment(Installment installment){
        this.installment.add(installment);
    }

}
