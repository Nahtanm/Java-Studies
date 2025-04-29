import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

//        System.out.print("Quantity in stock: ");
//        int quantity = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.printf("Product data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.totalValueInStock() );

        System.out.println(product);
        System.out.print("Enter the number of products to be added in stock: ");
        int valueAux = scanner.nextInt();

        product.addProducts(valueAux);
        System.out.printf("Updated data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.totalValueInStock() );

        System.out.print("Enter the number of products to be removed from stock: ");
        valueAux = scanner.nextInt();
        
        product.removeProducts(valueAux);
        System.out.printf("Updated data: %s, $ %.2f , %d units, total: $ %.2f\n",
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.totalValueInStock() );


        scanner.close();
    }
}