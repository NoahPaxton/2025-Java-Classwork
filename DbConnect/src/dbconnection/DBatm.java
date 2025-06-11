package dbconnection;


import java.sql.*;
import java.net.ConnectException;

public class DBatm {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/FlightBooking";
        String user = "admin";
        String password = "admin1234";

        try(Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected");
//            String sql = "insert into Booking values(?, ?, ?, ?, ?, ?)";
//       PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, "123456");
//            ps.setString(2, 1); // this should work normally
//            ps.setString(3, 1);
//            ps.setString(4, 1);
//            ps.setString(5, "1234567")
//            ps.setString(6, "12345");
            String sql = "select COUNT(*) from Booking";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
