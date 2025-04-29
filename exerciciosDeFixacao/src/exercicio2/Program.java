package exercicio2;

import exercicio2.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length array: ");
        int numberLenght = scanner.nextInt();

        Person[] arrayPerson = new Person[numberLenght];

        double height = 0;
        for (int i = 0; i < numberLenght; i++) {
            scanner.nextLine();
            System.out.printf("Enter %da person: %n", i+1);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter height: ");
            height = scanner.nextDouble();

            arrayPerson[i] = new Person(name, age, height);
        }

        double averageHeight = heightAverage(arrayPerson);

        System.out.printf("HEIGHT AVERAGE: %.2f%n", averageHeight);

        double percentageAge = agePercentage(arrayPerson);

        System.out.printf("people under 16 years old: %.2f%%n", percentageAge);

        for (Person x : arrayPerson){
            if(x.getAge() < 16){
                System.out.println(x.getName());
            }
        }

    }

    public static double heightAverage(Person[] arrayPerson){
        double soma = 0;
        for (Person x : arrayPerson){
            soma += x.getHeight();
        }
        return soma/arrayPerson.length;
    }

    public static double agePercentage(Person[] arrayPerson){
        double soma = 0;
        for (Person x : arrayPerson){
            if(x.getAge() < 16){
                soma += 1;
            }
        }
        return (100 * soma)/arrayPerson.length;
    }

}
