import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner cardnumber = new Scanner(System.in);
        Scanner pin = new Scanner(System.in);
        Random fakebalance = new Random();
        double fakebalanceDouble = fakebalance.nextInt(10000);
        Account account1=new Account(fakebalanceDouble, "1234432112344321", 1234);
        Account account2=new Account(fakebalanceDouble, "2345543223455432", 2345);

        System.out.println("Enter card number");
        String CardString = cardnumber.next();
        System.out.println("Enter pin");
        int pinInt = pin.nextInt();

        account1.getBalance();
        account2.getBalance();


    }
}