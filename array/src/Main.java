import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter length array: ");
        int numberLenght = scanner.nextInt();

        double[] arrayDouble = new double[numberLenght];

        for(int i = 0; i < numberLenght; i++){

            double numberAux = scanner.nextDouble();
            arrayDouble[i] = numberAux;

        }

        double soma = 0;
        for (double x : arrayDouble){
            soma += x;
        }

        System.out.printf("AVERAGE HEIGHT = %.2f",soma/numberLenght);

        scanner.close();
    }
}