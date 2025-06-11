import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read {
    public Member[] Read(Member[] members) {
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

        return members;
    }
}
