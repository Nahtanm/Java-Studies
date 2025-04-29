import br.nsantos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.next();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.printf("Product data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.name, product.price, product.quantity, product.totalValueInStock() );

        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        int valueAux = scanner.nextInt();
        product.addProducts(valueAux);
        System.out.printf("Updated data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.name, product.price, product.quantity, product.totalValueInStock() );

        System.out.print("Enter the number of products to be removed from stock: ");
        valueAux = scanner.nextInt();
        product.removeProducts(valueAux);
        System.out.printf("Updated data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.name, product.price, product.quantity, product.totalValueInStock() );


        scanner.close();
    }
}