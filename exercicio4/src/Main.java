import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double howManyDollar = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.paidInReais(dollarPrice, howManyDollar));

    }
}