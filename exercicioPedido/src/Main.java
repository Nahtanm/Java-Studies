import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameClient = scanner.nextLine();

        System.out.print("Email: ");
        String emailClient = scanner.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateCliente = scanner.nextLine();

        Client client = new Client(nameClient, emailClient, LocalDate.parse(dateCliente, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String statusOrder = scanner.nextLine();

        System.out.print("How many items to this order? ");
        Integer numberOrders = scanner.nextInt();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(statusOrder), client);
        for (int i = 1 ; i <= numberOrders; i++){
            scanner.nextLine();
            System.out.printf("Enter #%d item data: %n", i);
            System.out.print("Product name: ");
            String nameProduct = scanner.nextLine();

            System.out.print("Product price: ");
            Double priceProduct = scanner.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();

            Product product = new Product(nameProduct, priceProduct);
            OrderItem orderItem = new OrderItem(quantity, priceProduct, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Order status: " + order.getStatus().name());
        System.out.println("Client: " + client);
        System.out.println("Order items: ");

        for (OrderItem x : order.getOrderItems()){
            System.out.println(x);
        }

        System.out.println("Total price: " + order.total());


        scanner.close();

    }
}