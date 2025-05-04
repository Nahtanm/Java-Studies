import entities.Employee;
import entities.OutsoucedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        Integer numberAux = scanner.nextInt();

        int i = 1;
        while (i < numberAux + 1){
            scanner.nextLine();
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");

            String yesOrNo = scanner.nextLine().toLowerCase();
            Employee employee = null;
            
            switch (yesOrNo){
                case "y":
                    employee = createEmployeeOutsouced("y");
                    break;
                case "n":
                    employee = createEmployeeOutsouced("n");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
            if (employee != null){
                employeeList.add(employee);
            }

            i++;
        }

        System.out.println("PAYMENTS:");
        for (Employee x : employeeList){
            System.out.println(x.getName() + " - $ " + x.paymenyt());
        }

        scanner.close();
    }

    private static Employee createEmployeeOutsouced(String aux) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Hours: ");
        Integer hours = scanner.nextInt();

        System.out.print("Value per hours: ");
        Double valuePerHour = scanner.nextDouble();

        if (aux.equals("y")){
            System.out.print("Additional charge: ");
            Double additionalcharge = scanner.nextDouble();
            return new OutsoucedEmployee(name, hours, valuePerHour, additionalcharge);
        }

        return new Employee(name, hours,valuePerHour);
    }

}