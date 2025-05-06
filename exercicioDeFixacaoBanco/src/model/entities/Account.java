package model.entities;

import model.exception.WithdrawException;

public class Account {

    public Integer number;
    public String holder;
    public Double balance;
    public Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account() {

    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount)throws WithdrawException{
        if (amount <= balance && withdrawLimit >= amount){
            this.balance -= amount;
        }else if(amount > withdrawLimit){
            throw new WithdrawException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new WithdrawException("Not enough balance");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

}
