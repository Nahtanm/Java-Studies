import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int number = scanner.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date dateCheckIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date dateCheckOut = simpleDateFormat.parse(scanner.next());


            Reservation reservation = new Reservation(number, dateCheckIn, dateCheckOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            dateCheckIn = simpleDateFormat.parse(scanner.next());

            System.out.print("Check-in date (dd/MM/yyyy): ");
            dateCheckOut = simpleDateFormat.parse(scanner.next());

            reservation.updateDate(dateCheckIn, dateCheckOut);

            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");;
        }catch (DomainException e){
            System.out.println(e.getMessage());
        }


        scanner.close();

    }
}