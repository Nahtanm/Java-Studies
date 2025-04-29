package br.nsantos.triangulo1;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo trianguloA = new Triangulo();
        Triangulo trianguloB = new Triangulo();

        System.out.println("Enter the measures of triangle A: ");
        trianguloA.ladoUm = scanner.nextDouble();
        trianguloA.ladoDois = scanner.nextDouble();
        trianguloA.ladoTres = scanner.nextDouble();

        System.out.println("Enter the measures of triangle B: ");
        trianguloB.ladoUm = scanner.nextDouble();
        trianguloB.ladoDois = scanner.nextDouble();
        trianguloB.ladoTres = scanner.nextDouble();

        double p = (trianguloA.ladoUm + trianguloA.ladoDois + trianguloA.ladoTres) / 2.0;
        double areaTrianguloA = Math.sqrt(p * (p - trianguloA.ladoUm) * (p - trianguloA.ladoDois) * (p - trianguloA.ladoTres));

        p = (trianguloB.ladoUm + trianguloB.ladoDois + trianguloB.ladoTres) / 2.0;
        double areaTrianguloB = Math.sqrt(p * (p - trianguloB.ladoUm ) * (p - trianguloB.ladoDois) * (p - trianguloB.ladoTres));

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
