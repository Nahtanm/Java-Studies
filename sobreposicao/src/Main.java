import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new BusinessAccount(1003,"Bob", 1000.0, 500.0);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());


    }
}