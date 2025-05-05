package entities;

public class NaturalPerson extends Person{

    private Double healthSpending;

    public NaturalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public NaturalPerson() {
    }

    @Override
    public Double taxCalculation() {
        if(getAnnualIncome() >= 20000.00){
            return (getAnnualIncome() * 0.25) - (healthSpending * 0.5);
        }
        return (getAnnualIncome() * 0.15) - (healthSpending * 0.5);
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

}
