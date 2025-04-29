package assign1;

abstract class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    abstract double deposit();

    abstract double withdraw(int amount);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class Savings extends Account {
    private float interestRate;

    public Savings(int accountNumber, int balance) {
        super(accountNumber, balance);
        this.interestRate = 0.06f;
    }

    @Override
    public double deposit() {
        setBalance(getBalance() * interestRate + getBalance());
        return getBalance();
    }

    @Override
    public double withdraw(int amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return getBalance();

        }
        System.out.println("Low Balance");
        return -1;
    }

}

class Current extends Account {
    private int overdraftLimit;

    public Current(int accountNumber, double balance, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double deposit() {

        return getBalance();
    }

    @Override
    public double withdraw(int amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            return getBalance();
        }
        System.out.println("Overdraft limit exceeded");
        return -1;
    }

}

public class Q8 {
    public static void main(String[] args) {
        Savings s = new Savings(12345, 1000);
        System.out.println("Account Created\n\n");
        System.out.println("Current bal: " + (float) s.deposit());
        System.out.println("Current bal: " + (float) s.deposit());
        System.out.println("Current bal: " + (float) s.deposit());
        System.out.println("Current bal: " + (float) s.deposit());
        System.out.println("Current bal: " + (float) s.deposit());

        System.out.println("Current bal: " + (float) s.withdraw(500));

        Current c = new Current(67890, 500, 200);
        System.out.println("Current Account Created\n\n");
        System.out.println("Current bal: " + (float) c.deposit());
        System.out.println("Current bal: " + (float) c.withdraw(100));
        System.out.println("Current bal: " + (float) c.withdraw(600));
        System.out.println("Current bal: " + (float) c.withdraw(200));
        System.out.println("Current bal: " + (float) c.withdraw(50));
    }

}
