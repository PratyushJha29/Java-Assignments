
class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    Account(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0);
    }

    Account(String accountNumber, String ownerName, double balance) {
        if (accountNumber == null || accountNumber.isBlank())
            throw new IllegalArgumentException();

        if (ownerName == null || ownerName.isBlank())
            throw new IllegalArgumentException();

        if (balance < 0)
            throw new IllegalArgumentException();

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance)
            return false;

        balance -= amount;
        return true;
    }

    String getAccountNumber() {
        return accountNumber;
    }
    String getOwnerName() {
        return ownerName;
    }
    double getBalance() {
        return balance;
    }
    public String toString() {
        return accountNumber + " " + ownerName + " " + balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Rahul");
        Account a2 = new Account("A102", "Aman", 1000);

        System.out.println(a1.deposit(500));
        System.out.println(a1.deposit(0));
        System.out.println(a1.deposit(-100));

        System.out.println(a1.withdraw(200));
        System.out.println(a1.withdraw(1000));

        System.out.println(a1);
        System.out.println(a2);
    }
}

