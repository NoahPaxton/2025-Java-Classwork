import java.util.Scanner;
import java.io.*;

public class Read{
    public Read(Member mem, Member[] members) {
        try{
            FileWriter file=new FileWriter("club.txt");
            String s= mem.getName()+","+mem.getSurname()+","+mem.getMiles();
            file.write(s);
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try(Scanner fread=new Scanner(new FileReader("clubread.txt")))

        {
            String line;

            int j=0;
            while(fread.hasNext())
            {
                line = fread.nextLine();
                line=line.trim();
                String[] items = line.split(",");
                members[j]=new Member(items[0],items[1],Double.parseDouble(items[2]) );
                j++;
            }

            for (int i=0;i<j;i++)
            {
                System.out.println(members[i].getName()+","+members[i].getSurname()+","+members[i].getMiles());
            }
            fread.close();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return;
    }
}
