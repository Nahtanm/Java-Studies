import model.entities.Account;
import model.exception.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer numberAccount = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Holder: ");
        String holderAccount = scanner.nextLine();

        System.out.print("Initial balance: ");
        Double initialBalanceAccount = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimitAccount = scanner.nextDouble();

        Account account = new Account(numberAccount,
                holderAccount,
                initialBalanceAccount,
                withdrawLimitAccount);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amountWithdraw = scanner.nextDouble();
        
        try {
            account.withdraw(amountWithdraw);
            System.out.println("New balance: " + account.balance);
        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            scanner.close();
        }


    }
}