package entities;

public abstract class Person {

    private String name;
    private Double annualIncome;

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Person() {
    }

    public abstract Double taxCalculation();

    public String toString(){
        return name + " $ " + String.format("%.2f",taxCalculation());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

}
