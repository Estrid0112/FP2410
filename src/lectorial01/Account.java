package lectorial01;

public class Account {
    private String accountID;
    private String accountName;
    private double balance;

    public Account(String id, String name, double balance) {
        this.accountID = id;
        this.accountName = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.accountID = id;
        this.accountName = name;
        this.balance = 0.0;
    }

    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    public void setAccountName(String string) {
        this.accountName = string;

    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public double getBalance() {
        return this.balance;
    }

    //	@Override
    public String ToString() {
        return this.accountID + " " + this.accountName;
    }


}

