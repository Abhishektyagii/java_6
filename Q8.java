abstract class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account Deposit: " + amount);
    }

    @Override
    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Current withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(5000);

        CurrentAccount current =
                new CurrentAccount(10000);

        savings.deposit(1000);
        savings.withdraw(2000);

        current.deposit(2000);
        current.withdraw(3000);

        System.out.println(
            "Savings Balance: " + savings.balance
        );

        System.out.println(
            "Current Balance: " + current.balance
        );
    }
}