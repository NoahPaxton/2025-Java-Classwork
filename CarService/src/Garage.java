import java.sql.*;

public class Garage {
    private String garageID;
    private String garageName;
    private String address;
    private String town;
    private String postCode;
    private String phoneNo;

    public Garage(String garageID, String garageName, String address, String town, String postCode, String phoneNo) {
        this.garageID = garageID;
        this.garageName = garageName;
        this.address = address;
        this.town = town;
        this.postCode = postCode;
        this.phoneNo = phoneNo;

    }
// method to add garage to database
    public void addGarage (Connection con) {
        String sql = "insert into Garage values (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.garageID);
            ps.setString(2, this.garageName);
            ps.setString(3, this.address);
            ps.setString(4, this.town);
            ps.setString(5, this.postCode);
            ps.setString(6, this.phoneNo);
            ps.execute();
            System.out.println("Successfully entered!");
        } catch (Exception e) {
            System.out.println("an error occured. please try again");
        }

    }
//method to edit garage in database
    public void editGarage (Connection con) {
        try {
            String sql2 = "UPDATE Garage SET GarageID = ?, garageName = ?, address = ?, town = ?, postCode = ?, phoneNo = ? WHERE GarageID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.garageID);
            ps.setString(2, this.garageName);
            ps.setString(3, this.address);
            ps.setString(4, this.town);
            ps.setString(5, this.postCode);
            ps.setString(6, this.phoneNo);
            ps.setString(7, this.garageID);
            ps.execute();
            System.out.println("Successfully updated!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to delete garage in database
    public void deleteGarage (Connection con) {
        try {
            String sql2 = "DELETE FROM Garage WHERE GarageID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.garageID);
            ps.execute();
            System.out.println("Successfully deleted!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to search for garage in database
    public void SearchGarage (Connection con) {
        try {
            String sql = "SELECT * FROM Garage WHERE GarageID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.garageID);
            ResultSet rs = ps.executeQuery();
//            if the result set exists then it will count as found. if not it will not be counted as found.
            if (rs.next()) {
                System.out.println("Found in database!");
            } else {
                System.out.println("Not Found in database!");
            }
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
}
