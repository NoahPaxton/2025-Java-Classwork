import java.util.Scanner;

public class Write {
    public Write() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=input.next();
        System.out.println("Enter Surname");
        String surname=input.next();
        System.out.println("Enter Miles");
        double miles=input.nextDouble();
        Member mem=new Member(name,surname,miles);

        System.out.println("The name is "+mem.getName());
        System.out.println("The surname is "+mem.getSurname());
        System.out.println("The miles is "+mem.getMiles());
    }


}
