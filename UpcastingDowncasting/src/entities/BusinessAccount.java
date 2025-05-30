package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount() {

    }

    public void loan(Double amount){
        if (amount <= loanLimit){
            this.balance += amount - 10.00;
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
