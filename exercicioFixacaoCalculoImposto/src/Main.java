import entities.LegalEntity;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Person> personList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        Integer numebrOfficials = scanner.nextInt();

        for (int i = 1; i <= numebrOfficials; i++){

            System.out.printf("Tax payer #%d data:%n",i);
            System.out.print("Individual or company (i/c)? ");
            char indiOrComp = scanner.next().charAt(0);

            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = scanner.nextDouble();

            if (indiOrComp == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                personList.add(new NaturalPerson(name,anualIncome,healthExpenditures));
            }else if (indiOrComp == 'c'){
                System.out.print("Number of employees: ");
                Integer numberEmployees = scanner.nextInt();
                personList.add(new LegalEntity(name,anualIncome,numberEmployees));
            }


        }

        System.out.println("TAXES PAID");
        for(Person person : personList){
            System.out.println(person.toString());

        }

        scanner.close();
    }
}