import java.sql.*;

public class Car {
    private String regNo;
    private String make;
    private String model;
    private String year;
    private String customerID;

    public Car(String regNo, String make, String model, String year, String customerID) {
        this.regNo = regNo;
        this.make = make;
        this.model = model;
        this.year = year;
        this.customerID = customerID;
    }
// method to edit car from database
    public void editCar(Connection con) {
        try {
            String sql2 = "UPDATE Car SET regNo = ?, make = ?, model = ?, year = ?, customerID = ?, WHERE regNo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.regNo);
            ps.setString(2, this.make);
            ps.setString(3, this.model);
            ps.setString(4, this.year);
            ps.setString(5, this.customerID);
            ps.setString(6, this.regNo);
            ps.execute();
            System.out.println("Successfully updated!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to delete car from database

    public void deleteCar(Connection con) {
        try {
            String sql2 = "DELETE FROM Car WHERE regNo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.regNo);
            ps.execute();
            System.out.println("Successfully deleted!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to search for occurance in database

    public void searchCar(Connection con) {
        try {
            String sql = "SELECT * FROM Car WHERE regNo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.regNo);
            ResultSet rs = ps.executeQuery();
//          if the result set exists then it will count as found. if not it will not be counted as found.
            if (rs.next()) {
                System.out.println("Found in database!");
            } else {
                System.out.println("Not Found in database!");
            }
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to add car to database

    public void CreateCar(Connection con) {
        String sql = "insert into Car values (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.regNo);
            ps.setString(2, this.make);
            ps.setString(3, this.model);
            ps.setString(4, this.year);
            ps.setString(5, this.customerID);
            ps.execute();
            System.out.println("Successfully entered!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
}
