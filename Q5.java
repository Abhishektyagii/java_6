class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println(
                "Withdrawal not allowed. Minimum balance of 100 required."
            );
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);

        account.withdraw(550);
        account.withdraw(100);

        System.out.println("Balance: " + account.balance);
    }
}