package entites;

import enums.OrderStatus;

import java.time.LocalDate;

public class Order {

    private Integer id;
    private LocalDate moment;
    private OrderStatus status;

    public Order(Integer id, LocalDate moment,OrderStatus status ) {
        this.status = status;
        this.moment = moment;
        this.id = id;
    }

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
