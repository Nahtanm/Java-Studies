package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1000.00, "Tv"));
        products.add(new Product(50.00, "Iphone"));
        products.add(new Product(90.00, "Sapato"));

        products.removeIf(Product::staticProductPredicate);

        products.forEach(System.out::println);


    }

}
