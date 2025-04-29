package arrayDois;

import java.util.Locale;
import java.util.Scanner;

public class arrayComClasse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter length array: ");
        int numberLenght = scanner.nextInt();


        Product[] productArray = new Product[numberLenght];

        for(int i = 0; i < numberLenght; i++){
            scanner.nextLine();
            System.out.print("Enter name product: ");
            String nameProduct = scanner.nextLine();

            System.out.print("Enter price product: ");
            double numberAux = scanner.nextDouble();

            productArray[i] = new Product(nameProduct, numberAux);

        }

        double soma = 0;
        for (Product x : productArray){
            soma += x.getPrice();
        }

        System.out.printf("AVERAGE PRICE = %.2f",soma/numberLenght);

        scanner.close();
    }
}
