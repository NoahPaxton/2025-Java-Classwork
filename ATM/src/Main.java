import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank account1=new Bank("test",234566, 456765, "12345678965756",1234);
        boolean validation = true;
        boolean infiniteloop = true;
        while (validation) {
            System.out.println("Enter bankCard Number: ");
            Scanner getcardinput = new Scanner(System.in);
            String cardinput = getcardinput.nextLine();
            System.out.println("Enter pin: ");
            Scanner getpininput = new Scanner(System.in);
            String pininput = getpininput.nextLine();
            if (cardinput.equals("12345678965756") && pininput.equals("1234")) {
                validation = false;

            } else {
                System.out.println("Invalid Card and/or pin Number");
                System.out.println(cardinput);
            }
        }

        while (infiniteloop) {
            System.out.println("menu \n 1) balance \n 2) withdraw \n 3) deposit \n 4) exit");
            Scanner getuserchoice = new Scanner(System.in);
            String choice = getuserchoice.nextLine();

            switch (choice) {
                case "1" -> account1.getBalance();
                case "2" -> {
                    System.out.println("please enter number to select account to withdraw from: savings - 1, checking - 2");
                    Scanner GetWithdrawOption = new Scanner(System.in);
                    int WithdrawOption = GetWithdrawOption.nextInt();
                    Scanner getamount = new Scanner(System.in);
                    System.out.println("Enter amount to withdraw: ");
                    double amount = getamount.nextDouble();
                    account1.withdraw(amount, WithdrawOption);
                }
                case "3" -> {
                    System.out.println("please enter number to select account to deposit to: savings - 1, checking - 2");
                    Scanner GetDepositOption = new Scanner(System.in);
                    int DepositOption = GetDepositOption.nextInt();
                    Scanner getamount = new Scanner(System.in);
                    System.out.println("Enter amount to deposit: ");
                    double amount = getamount.nextDouble();
                    account1.deposit(amount, DepositOption);
                }
                case "4" -> System.exit(0);
            }
        }
    }
}
