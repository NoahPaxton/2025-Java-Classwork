import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=input.next();
        System.out.println("Enter Surname");
        String surname=input.next();
        System.out.println("Enter Miles");
        double miles=input.nextDouble();


        Member mem=new Member(name,surname,miles);
        Member[] members=new Member[4];
        double max = 0;
        System.out.println("The name is "+mem.getName());
        System.out.println("The surname is "+mem.getSurname());
        System.out.println("The miles is "+mem.getMiles());

        Write write=new Write();
        write.Write(mem);
        Read read=new Read();
        read.Read(members);
        Winner winner = new Winner();
        max = winner.whowon(members, max);
        write.Write70(members, max);
        System.out.println();
    }
}
