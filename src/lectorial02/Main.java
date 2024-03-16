package lectorial02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        // code reuse in method
        Main.upgradeAccount(account1);
        account1.withdraw();//SA

        Account account2 = new Account();
        account2.withdraw();//A

        account2 = account1;
        account2.withdraw();//SA




        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account());
        accounts.add(new Account());
        accounts.add(new SavingsAccount());
        accounts.add(new SavingsAccount());

        // code reuse in for loop
        for(Account account: accounts){
            account.withdraw();
        }

    }

    public static void upgradeAccount(Account account){
        //upgrade account
    }
}
