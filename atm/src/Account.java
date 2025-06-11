public class Account {
    private double balance;
    private String cardnumber;
    private int pincode;

    public Account(double balance, String cardnumber, int pincode) {
        this.balance = balance;
        this.cardnumber = cardnumber;
        this.pincode = pincode;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;

    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
