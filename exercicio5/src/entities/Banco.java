package entities;

public class Banco {

    private Integer numberAccount;
    private String titleHolder;
    private Double userMoney;

    public Banco(){

    }

    public Banco(Integer numberAccount, String titleHolder){
        this.numberAccount = numberAccount;
        this.titleHolder = titleHolder;
        this.userMoney = 0.00;
    }

    public Banco(Integer numberAccount, String titleHolder, Double depositAmount) {
        this.numberAccount = numberAccount;
        this.titleHolder = titleHolder;
        this.userMoney = depositAmount;
    }

    public void depositMoney(Double depositMoney){
        this.userMoney += depositMoney;
    }

    public void withdrawMoney(Double witchdrawMoney){
        this.userMoney -= (witchdrawMoney + 5);
    }

    public String toString(){
        return "Account " + numberAccount
                + ", Holder: " + titleHolder
                + ", Balance: $ " + String.format("%.2f", userMoney);
    }

    public void setTitleHolder(String titleHolder) {
        this.titleHolder = titleHolder;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    public String getTitleHolder() {
        return titleHolder;
    }
}
