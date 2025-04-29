package exercicio3;

import exercicio3.entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length array: ");
        int numberLenght = scanner.nextInt();

        Room[] arrayRoom = new Room[10];


        for (int i = 0; i < numberLenght; i++) {
            scanner.nextLine();
            System.out.printf("Rent #%d: %n", i+1);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            arrayRoom[room] = new Room(name, email, room);
        }

        System.out.println("Busy rooms");
        for (Room x : arrayRoom){
            if (x != null){
                System.out.println(x);
            }
        }

    }


}
