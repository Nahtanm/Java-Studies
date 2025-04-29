import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length array: ");
        int numberLenght = scanner.nextInt();

        int[] arrayInt = new int[numberLenght];

        for (int i = 0; i < numberLenght; i++) {
            System.out.print("Enter number: ");
            int numberAux = scanner.nextInt();

            arrayInt[i] = numberAux;
        }

        System.out.println("Number negative: ");
        for (int x : arrayInt) {
            if (x < 0){
                System.out.println(x);
            }
        }


        scanner.close();

    }
}