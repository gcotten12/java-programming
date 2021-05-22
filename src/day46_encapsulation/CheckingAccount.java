package day46_encapsulation;

public class CheckingAccount {
    private int balance;
    private int accountNum;
    private String accountHolder;
    private String type = "Checking";

//    public void setAccountInfo(int balance, int accountNum, String accountHolder) {
//        this.balance = balance;
//        this.accountNum = accountNum;
//        this.accountHolder = accountHolder;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public int getAccountNum() {
//        return accountNum;
//    }
//
//    public String getAccountHolder() {
//        return accountHolder;
//    }

    // right click -> generate -> getter and setter -> select all -> ok

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNum=" + accountNum +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
