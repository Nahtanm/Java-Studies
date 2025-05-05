import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        Account account1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);


        Account account2 = new BusinessAccount(1003,"Bob", 1000.0, 500.0);


        accounts.add(account1);
        accounts.add(account2);

        Double sum = 0.0;

        for (Account x : accounts){
            sum += x.getBalance();
            x.deposit(10.00);
        }
        System.out.println("Total das contas: " + sum);

        for (Account x : accounts){
            System.out.println(x);
        }

    }
}