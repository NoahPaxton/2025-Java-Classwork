import java.io.*;

public class Write {
    public Member Write(Member mem) {
        try{
            FileWriter file=new FileWriter("club.txt");
            String s= mem.getName()+","+mem.getSurname()+","+mem.getMiles();
            file.write(s);
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return mem;
    }
    public void Write70(Member[] members, double max) {
        try {
        int i=0;
        FileWriter file=new FileWriter("more70.txt");
        while (i < members.length) {
            if (members[i].getMiles() * 100 / max >= 70.0 && members[i].getMiles() * 100 / max < 100) {
                String s = members[i].getName();
                file.write(s);
            }
            i++;


        }
            try {
                BufferedReader br=new BufferedReader(new FileReader("more70.txt"));
                if (br.readLine() == null) {
                    file.write("no one got more than 70% of the winner");
                    System.out.println("no one got more than 70% of the winner");
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
