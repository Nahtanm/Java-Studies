import entities.Item;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String pathItems = "/home/nahtanm/Documentos/exercicioComArquivos/item.csv";
    public static String pathSummary = "/home/nahtanm/Documentos/exercicioComArquivos/out";

    public static void main(String[] args) {

        boolean sucess = new File(pathSummary).mkdir();
        Locale.setDefault(Locale.US);

        System.out.print("Quantos items deseja cadastrar? ");
        Integer numberItem = scanner.nextInt();

        for (int i = 1; i <= numberItem; i++){
            System.out.println("Entre com o item #" + i);
            scanner.nextLine();
            System.out.print("Entre com o nome do item: ");
            String nameItem = scanner.nextLine();

            System.out.print("Entre com o preco do item:");
            Double priceItem = scanner.nextDouble();

            System.out.print("Entre com o quantidade do item:");
            Integer quantityItem = scanner.nextInt();

            Item item = new Item(nameItem, priceItem, quantityItem);

            registerInFile(item);

        }
        readerItemInFile();
        scanner.close();
    }

    public static void registerInFile(Item item) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathItems, true))) {

            outFile(item);
            bufferedWriter.write(item.getName() + ", " + item.getPrice() + ", " + item.getQuantity());
            bufferedWriter.newLine();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void outFile(Item item) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathSummary + "/summary.csv", true))) {

            bufferedWriter.write(item.getName() + ", " + item.subTotal());
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void readerItemInFile() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathSummary + "/summary.csv"))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}