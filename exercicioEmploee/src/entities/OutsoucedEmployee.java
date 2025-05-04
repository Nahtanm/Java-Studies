package entities;

public class OutsoucedEmployee extends Employee{

    private Double additionalCharge;

    public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double paymenyt() {
        Double result = super.paymenyt();
        return result + (additionalCharge * 1.1);
    }
}
