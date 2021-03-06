package classstructureintegrate.bank;

public class BankAccount {

    private final String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.deposit(-amount);
    }

    public String getInfo() {
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }

    public void transfer(BankAccount to, int amount) {
        this.withdraw(amount);
        to.deposit(amount);
    }


}







