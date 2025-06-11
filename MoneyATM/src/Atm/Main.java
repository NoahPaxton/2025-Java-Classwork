package Atm;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String connection = "jdbc:mysql://localhost:3306/atm";
        String username = "admin";
        String password = "admin1234";

        try(Connection connection1=DriverManager.getConnection(connection,username,password))
        {
            System.out.println("Connected");
            String ID = "wnugfeybr";
            String sql="select * from account where userID='"+ID+"'";
            Statement statement1=connection1.createStatement();
            ResultSet resultSet1=statement1.executeQuery(sql);
            while (resultSet1.next())
            {
                System.out.println(resultSet1.getString(1) +" "+ resultSet1.getString(2) +" "+ resultSet1.getString(3)+" " + resultSet1.getString(4));
                double amount=resultSet1.getDouble(3);
                amount=amount+100;
                System.out.println(amount);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
