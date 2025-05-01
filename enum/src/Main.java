import entites.Order;
import enums.OrderStatus;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus orderStatus = OrderStatus.PROCESSING;
        System.out.println(orderStatus);

        OrderStatus orderStatus1 = OrderStatus.valueOf("DELIVERED");
        System.out.println(orderStatus1);

    }
}