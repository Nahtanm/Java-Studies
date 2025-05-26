package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1000.00, "Tv"));
        products.add(new Product(2000.00, "Iphone"));
        products.add(new Product(200.00, "Sapato"));

        products.forEach(x -> x.setPrice(x.getPrice() * 0.1 + x.getPrice()));

        products.forEach(x -> System.out.println(x));

    }
}
