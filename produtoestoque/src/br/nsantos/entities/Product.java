package br.nsantos.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quanti){
        quantity = quantity + quanti;
    }

    public void  removeProducts(int quanti){
        quantity = quantity - quanti;
    }

    public String toString(){
        return "name: " + name +
                " price: " + price +
                " quantidade: " + quantity + "}";
    }

}
