import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Upcasting
        Account account = new Account();
        Account accountBusinessAccount = new BusinessAccount();
        Account accountSavingsAccount = new SavingsAccount();

        //Downcasting
        Account account1 = accountBusinessAccount;

        BusinessAccount businessAccount =(BusinessAccount) accountBusinessAccount;
        SavingsAccount savingsAccount = (SavingsAccount) accountSavingsAccount;


    }
}