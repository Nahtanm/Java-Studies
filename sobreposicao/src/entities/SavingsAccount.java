package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
    }

    @Override
    public void withdraw(Double amount) {
        this.balance -= amount;
    }

    public void updateBalance(){
        this.balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
