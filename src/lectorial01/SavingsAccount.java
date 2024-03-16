package lectorial01;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountID, String accountName, double amount) {
        // calling the super() constructor to initialize the attribute of super class
        super(accountID, accountName, amount);
        // initialize the attribute of this class
        this.interestRate = 0.05;
    }

    public void addInterest() {
        this.setBalance(this.getBalance() * (1 + this.interestRate));
    }

    // override the toString method in superclass
    public String toString() {
        String tmp = super.toString();
        return tmp + " " + this.interestRate;
    }
}

