import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double ladoUmTrianguloA, ladoDoisTrianguloA, ladoTresTrianguloA,
                ladoUmTrianguloB,ladoDoisTrianguloB,ladoTresTrianguloB,
                p, areaTrianguloA, areaTrianguloB;

        System.out.println("Enter the measures of triangle x: ");
        ladoUmTrianguloA = scanner.nextDouble();
        ladoDoisTrianguloA = scanner.nextDouble();
        ladoTresTrianguloA = scanner.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        ladoUmTrianguloB = scanner.nextDouble();
        ladoDoisTrianguloB = scanner.nextDouble();
        ladoTresTrianguloB = scanner.nextDouble();

        p = (ladoUmTrianguloA + ladoDoisTrianguloA + ladoTresTrianguloA) / 2.0;
        areaTrianguloA = Math.sqrt(p * (p - ladoUmTrianguloA) * (p - ladoDoisTrianguloA) * (p - ladoTresTrianguloA));

        p = (ladoUmTrianguloB + ladoDoisTrianguloB + ladoTresTrianguloB) / 2.0;
        areaTrianguloB = Math.sqrt(p * (p - ladoUmTrianguloB) * (p - ladoDoisTrianguloB) * (p - ladoTresTrianguloB));

        System.out.printf("Triangle x area: %.2f\n", areaTrianguloA);
        System.out.printf("Triangle y area: %.2f\n", areaTrianguloB);

        if (areaTrianguloA > areaTrianguloB){
            System.out.println("Triangle large: X");
        }else {
            System.out.println("Triangle large: y");
        }

        scanner.close();


    }
}