package lectorial01;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("123", "Alice Spring", 0.0);
        Account estrid = new Account("124", "Estrid He");

        account.setAccountID("123");
        account.setAccountName("Alice Spring");

        System.out.println(account);
        System.out.println(account.ToString());
    }

}

