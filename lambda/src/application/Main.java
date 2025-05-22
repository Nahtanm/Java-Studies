package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1000.00, "Tv"));
        products.add(new Product(2000.00, "Iphone"));
        products.add(new Product(200.00, "Sapato"));

        Comparator<Product> comparator1 = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Comparator<Product> comparator2 = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        products.sort(( p1,  p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product t : products){
            System.out.println(t);
        }

    }
}