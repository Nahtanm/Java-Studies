package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program4 {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1000.00, "Tv"));
        products.add(new Product(2000.00, "Iphone"));
        products.add(new Product(200.00, "Sapato"));

        Function<Product,String> listListFunction = (products1) ->{
            return products1.getName().toUpperCase();
        };

        List<String> strings = products.stream().map(listListFunction).toList();

        strings.forEach(x-> System.out.println(x));

    }
}
