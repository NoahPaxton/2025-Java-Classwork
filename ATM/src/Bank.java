public class Bank extends Account {
    private double CheckingAccount;
    private double SavingsAccount;
    public Bank(String name, double checkingAccount, double savingsAccount, String bankCard, int pin) {
        super(name, bankCard, pin);
        this.CheckingAccount = checkingAccount;
        this.SavingsAccount = savingsAccount;
    }


    public void withdraw(double amount, int withdrawOption) {
        if (withdrawOption == 1) {
             this.SavingsAccount -= amount;
        }
        else if (withdrawOption == 2) {
            this.CheckingAccount -= amount;

        }
    }

    public void getBalance() {
        System.out.println("Your balance is: £" + (CheckingAccount + SavingsAccount));
    }

    public void deposit(double amount, int depositOption) {
        if (depositOption == 1) {
            this.SavingsAccount += amount;
        }
        else if (depositOption == 2) {
            this.CheckingAccount += amount;
        }
    }
}