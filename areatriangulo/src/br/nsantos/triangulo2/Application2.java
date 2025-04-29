package br.nsantos.triangulo2;

import br.nsantos.triangulo1.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo2 trianguloA = new Triangulo2();
        Triangulo2 trianguloB = new Triangulo2();

        System.out.println("Enter the measures of triangle A: ");
        trianguloA.ladoUm = scanner.nextDouble();
        trianguloA.ladoDois = scanner.nextDouble();
        trianguloA.ladoTres = scanner.nextDouble();

        System.out.println("Enter the measures of triangle B: ");
        trianguloB.ladoUm = scanner.nextDouble();
        trianguloB.ladoDois = scanner.nextDouble();
        trianguloB.ladoTres = scanner.nextDouble();

        double areaTrianguloA = trianguloA.calcularArea();

        double areaTrianguloB = trianguloB.calcularArea();

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
