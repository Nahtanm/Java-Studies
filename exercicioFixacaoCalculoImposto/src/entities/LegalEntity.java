package entities;

public class LegalEntity extends Person{

    private Integer numberOfficials;

    public LegalEntity(String name, Double annualIncome, Integer numberOfficials) {
        super(name, annualIncome);
        this.numberOfficials = numberOfficials;
    }

    public LegalEntity() {
    }

    @Override
    public Double taxCalculation() {
        if (numberOfficials > 10){
            return getAnnualIncome() * 0.14;
        }
        return getAnnualIncome() * 0.16;
    }

    public Integer getNumberOfficials() {
        return numberOfficials;
    }
}
