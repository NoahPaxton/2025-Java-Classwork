import java.sql.*;

public class Customer {
    private String customerID;
    private String forename;
    private String surname;
    private String address;
    private String postCode;
    private String phoneNo;
    public Customer(String customerID, String forename, String surname, String address, String postCode, String phoneNo) {
        this.customerID = customerID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.postCode = postCode;
        this.phoneNo = phoneNo;
    }

    // method to edit customer from database

    public void editCustomer(Connection con) {
        try {
            String sql2 = "UPDATE Customer SET customerID = ?, forename = ?, surname = ?, address = ?, postCode = ?, phoneNo = ? WHERE customerID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.customerID);
            ps.setString(2, this.forename);
            ps.setString(3, this.surname);
            ps.setString(4, this.address);
            ps.setString(5, this.postCode);
            ps.setString(6, this.phoneNo);
            ps.setString(7, this.customerID);
            ps.execute();
            System.out.println("Successfully updated!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to delete customer from database

    public void deleteCustomer(Connection con) {
        try {
            String sql2 = "DELETE FROM Customer WHERE customerID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.customerID);
            ps.execute();
            System.out.println("Successfully deleted!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to search for occurance in database

    public void SearchCustomer(Connection con) {
        try {
            String sql = "SELECT * FROM Customer WHERE customerID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.customerID);
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
// method to add customer to database

    public void CreateCustomer(Connection con) {
        String sql = "insert into Customer values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.customerID);
            ps.setString(2, this.forename);
            ps.setString(3, this.surname);
            ps.setString(4, this.address);
            ps.setString(5, this.postCode);
            ps.setString(6, this.phoneNo);
            ps.execute();
            System.out.println("Successfully entered!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
}
