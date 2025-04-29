import entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Integer numberAccount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String titleHolder = scanner.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String variableAux = scanner.next();

        Banco banco;
        if(variableAux.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            Double depositInitial = scanner.nextDouble();

            banco = new Banco(numberAccount,titleHolder, depositInitial);
        }else{
            banco = new Banco(numberAccount, titleHolder);
        }

        System.out.println("Account data: ");
        System.out.println(banco.toString());

        System.out.print("Enter a deposit value: ");
        Double variableMoney = scanner.nextDouble();
        banco.depositMoney(variableMoney);

        System.out.println("Updated account data: ");
        System.out.println(banco.toString());

        System.out.print("Enter a withdraw value: ");
        variableMoney = scanner.nextDouble();
        banco.withdrawMoney(variableMoney);

        System.out.println("Updated account data: ");
        System.out.println(banco.toString());





        scanner.close();

    }
}