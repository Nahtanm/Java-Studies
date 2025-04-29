import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("How many employees will be registered? ");
        Integer numberAux = scanner.nextInt();

        registeredEmployee(numberAux);

        System.out.print("Enter the employee id that will have salary increase: ");
        numberAux = scanner.nextInt();

        Employee employee = getEmployee(numberAux);

        if (employee != null) {
            System.out.print("Enter the percentage: ");
            Double numberPercentage = scanner.nextDouble();
            employee.salaryIncrease(numberPercentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees: ");
        employeeList.forEach(x -> System.out.println(x));

        scanner.close();
    }

    public static Employee getEmployee(Integer idEmployee) {
        for (Employee x : employeeList) {
            if (x.getId() == idEmployee) {
                return x;
            }
        }
        return null;
    }

    public static void registeredEmployee(Integer numberAux) {
        for (int i = 0; i < numberAux; i++) {
            System.out.printf("Employee #%d:%n", i+1);

            System.out.print("Enter id number: ");
            Integer numberId = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Enter name: ");
            String titleHolder = scanner.nextLine();

            System.out.print("Enter salary: ");
            Double variableAux = scanner.nextDouble();

            employeeList.add(new Employee(numberId, titleHolder, variableAux));

        }
    }
}