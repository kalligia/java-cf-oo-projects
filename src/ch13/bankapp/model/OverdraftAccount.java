package ch13.bankapp.model;


public class OverdraftAccount {

    private String iban;
    private double balance;

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) throws Exception {
        try {
            balance += amount;
            System.out.println("Deposit of " + amount + " success.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void withdraw(double amount) throws Exception {
        try {
            balance -= amount;
            System.out.println("Withdraw of " + amount + " success.");
            if (balance < 0) {
                System.out.println("You made an overdraft.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public double getAccountBalance() {
        return getBalance();
    }
}
