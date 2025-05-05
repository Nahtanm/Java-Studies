import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> productList = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        Integer numberProducts = scanner.nextInt();

        for(int i = 1; i <= numberProducts; i++){
            System.out.printf("Product #%d data:%n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char productTags = scanner.next().charAt(0);

            Product product = registedProduct(productTags);
            productList.add(product);
        }

        System.out.println("PRICE TAGS");

        for (Product x : productList){
            System.out.println(x.priceTag());
        }

        scanner.close();
    }

    private static Product registedProduct(char productTags) {
        scanner.nextLine();
        System.out.print("Name: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Price: ");
        Double priceProduct = scanner.nextDouble();

        if (productTags == 'u'){
            scanner.nextLine();
            System.out.print("Manufacture date (DD/MM/YYYY): ");
            String dateManufacture = scanner.nextLine();

            return new UsedProduct(nameProduct,priceProduct, LocalDate.parse(dateManufacture, formatter));
        } else if (productTags == 'i') {
            System.out.print("Customms fee: ");
            Double custommsFee = scanner.nextDouble();

            return new ImportedProduct(nameProduct, priceProduct, custommsFee);
        }

        return new Product(nameProduct, priceProduct);
    }
}