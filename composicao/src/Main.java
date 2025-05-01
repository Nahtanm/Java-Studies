import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static  Worker worker;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        Departament departament = new Departament(departmentName);

        registedWorker(departament);

        System.out.print("How many contracts to this worker? ");
        Integer numberContract = scanner.nextInt();

        registedContract(numberContract);

        scanner.nextLine();
        System.out.print("Enter month and year to calculate income(MM/YYYY): ");
        String date = scanner.nextLine();
        String[] vet = date.split("/");

        Integer year = Integer.valueOf(vet[1]);
        Integer month = Integer.valueOf(vet[0]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.printf("Income for %s: %.2f", date, worker.income(year, month));

        scanner.close();
    }

    public static void registedWorker(Departament departament){
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();

        worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, departament);
    }

    public static void registedContract(Integer numberContract){
        for (int i = 0;i < numberContract; i++){

            scanner.nextLine();
            System.out.printf("Enter contract #%d data: %n",i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.nextLine();

            System.out.print("Value per hour: ");
            Double perHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            Integer duration = scanner.nextInt();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate1 = LocalDate.parse(date, formatter);

            HourContract contract = new HourContract(localDate1, perHour, duration);
            worker.addContract(contract);

        }
    }
}