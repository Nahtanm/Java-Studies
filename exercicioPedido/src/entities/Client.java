package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private String name;
    private String email;
    private LocalDate localDate;

    public Client(String name, String email, LocalDate localDate) {
        this.name = name;
        this.email = email;
        this.localDate = localDate;
    }

    @Override
    public String toString() {

        return name + " " +
                "(" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")" +
                " - " + email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
