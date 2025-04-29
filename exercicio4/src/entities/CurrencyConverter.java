package entities;

public class CurrencyConverter {

    public static final double TAX = 0.06;

    public static double paidInReais(double dollarPrice, double howManyDollar){
        return ((dollarPrice * howManyDollar) * TAX) + dollarPrice * howManyDollar;
    }

}
