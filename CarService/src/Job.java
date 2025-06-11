import java.sql.*;
import java.util.Date;

public class Job {
    private String jobID;
    private String carRegNO;
    private String garageID;
    private String datein;
    private String dateout;
    private String cost;

    public Job(String jobID, String carRegNO, String garageID, String datein, String dateout, String cost) {
        this.jobID = jobID;
        this.carRegNO = carRegNO;
        this.garageID = garageID;
        this.datein = datein;
        this.dateout = dateout;
        this.cost = cost;
    }

    public Job(String jobID, String carRegNO, String garageID, String datein, String dateout) {
        this.jobID = jobID;
        this.carRegNO = carRegNO;
        this.garageID = garageID;
        this.datein = datein;
        this.dateout = dateout;
        this.cost = "";
    }
// method to edit job from database
    public void editJob(Connection con) {
        try {
            String sql2 = "UPDATE Job SET JobID = ?, garageID = ?, dateIn = ?, dateOut = ?, regNo = ?, cost = ? WHERE JobID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.jobID);
            ps.setString(2, this.garageID);
            ps.setString(3, this.datein);
            ps.setString(4, this.dateout);
            ps.setString(5, this.carRegNO);
            ps.setString(6, this.cost);
            ps.setString(7, this.jobID);
            ps.execute();
            System.out.println("Successfully updated!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to delete job from database
    public void deleteJob(Connection con) {
        try {
            String sql2 = "DELETE FROM Job WHERE JobID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, this.jobID);
            ps.execute();
            System.out.println("Successfully deleted!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }
// method to search for job in database
    public void SearchJob(Connection con) {
        try {
            String sql = "SELECT * FROM Job WHERE JobID LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.jobID);
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
// method to add job to database
    public void CreateJob(Connection con) {
        String sql = "insert into Job values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.jobID);
            ps.setString(2, this.garageID);
            ps.setString(3, this.datein);
            ps.setString(4, this.dateout);
            ps.setString(5, this.carRegNO);
            ps.setString(6, this.cost);
            ps.execute();
            System.out.println("Successfully entered!");
        } catch (SQLException e) {
            System.out.println("an error occured. please try again");
        }
    }

}