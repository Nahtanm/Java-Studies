import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date dateCheckIn = simpleDateFormat.parse(scanner.next());

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date dateCheckOut = simpleDateFormat.parse(scanner.next());

        if (!dateCheckOut.after(dateCheckIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, dateCheckIn, dateCheckOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            dateCheckIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-in date (dd/MM/yyyy): ");
            dateCheckOut = simpleDateFormat.parse(scanner.next());

            Date now = new Date();
            if (dateCheckIn.before(now) || dateCheckOut.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }else if (!dateCheckOut.after(dateCheckIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }else {
                reservation.updateDate(dateCheckIn, dateCheckOut);
                System.out.println("Reservation: " + reservation);
            }

        }

        scanner.close();

    }
}