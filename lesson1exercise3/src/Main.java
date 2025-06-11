import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator equation1= new Calculator(2,2);
        Calculator equation2= new Calculator(5,9);
        equation2.setNumber1(30);
        equation1.setNumber2(444);

        System.out.println(equation2.addition() + " " + equation1.addition() + " " + equation2.subtract() + " " +
                equation2.divide() + " " + equation1.multiply());

    }
}
