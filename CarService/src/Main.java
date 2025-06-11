import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/CarService";
        String user = "admin";
        String password = "admin";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected");
            while (true) {


                System.out.println("Main Menu \n 1) Garage Menu \n 2) Job Menu \n 3) Customer Menu \n 4) Car Menu \n 0) Exit");
                Scanner choice = new Scanner(System.in);
                int choice1 = choice.nextInt();

                if (choice1 == 1) {
                    System.out.println("Garage Menu \n 1) Garage Create Menu \n 2) View Garages \n 0) back ");

                    int choice2 = choice.nextInt();

                    if (choice2 == 1) {
                        Scanner details = new Scanner(System.in);
                        System.out.println("Please enter the Garage details (garageID, garageName, address, town, postcode, phoneNo) (either details for a new garage or details for one that already exists)");
                        Garage garage = new Garage(details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine());
                        System.out.println("Garage create Menu \n 1) enter details into database (only new entries) \n 2) modify entry (only existing entries) \n 3) delete entry (only existing entries) \n 4) check if matching entry exists \n 0) back");
                        int choice3 = choice.nextInt();

                        if (choice3 == 1) {
                            garage.addGarage(con);
                        } else if (choice3 == 2) {
                            garage.editGarage(con);
                        } else if (choice3 == 3) {
                            garage.deleteGarage(con);
                        } else if (choice3 == 4) {
                            garage.SearchGarage(con);
                        } else {
                            // go back to main menu
                        }

                    } else if (choice2 == 2) {
                        String sql = "select * from Garage";
                        try {
                            Statement stmt = con.createStatement();
                            ResultSet rs = stmt.executeQuery(sql);
                            while (rs.next()) {
                                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(5) + "," + rs.getString(6));
                            }
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // go back to main menu
                    }
                } else if (choice1 == 2) {
                    System.out.println("Job Menu \n 1) Job Create Menu \n 2) View Jobs \n 0) back");

                    int choice2 = choice.nextInt();
                    if (choice2 == 1) {
                        System.out.println("1) include cost \n 2) dont include cost (can be updated later) \n 0) back");
                        int choice3 = choice.nextInt();
                        Job job1 = null;
                        if (choice3 == 1) {
                            Scanner details = new Scanner(System.in);
                            System.out.println("Please enter the Job details (jobID, carRegNO, garageID, datein (YYYY-MM-DD), dateout (YYYY-MM-DD), cost)  (either details for a new job or details for one that already exists)");
                            job1 = new Job(details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine());
                        } else if (choice3 == 2) {
                            Scanner details = new Scanner(System.in);
                            System.out.println("Please enter the Job details (jobID, carRegNO, garageID, datein (YYYY-MM-DD, dateout (YYYY-MM-DD))  (either details for a new job or details for one that already exists)");
                            job1 = new Job(details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine());
                        } else {
                            // go back to main menu
                        }

                        System.out.println("Job create Menu \n 1) enter details into database (only new entries) \n 2) modify entry (only existing entries) \n 3) delete entry (only existing entries) \n 4) check if matching entry exists \n 0) back");

                        int choice4 = choice.nextInt();
                        if (choice4 == 1) {
                            job1.CreateJob(con);
                        } else if (choice4 == 2) {
                            job1.editJob(con);
                        } else if (choice4 == 3) {
                            job1.deleteJob(con);
                        } else if (choice4 == 4) {
                            job1.SearchJob(con);
                        } else {
                            // go back to main menu
                        }

                    } else if (choice2 == 2) {
                        String sql = "select * from Job";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(5) + "," + rs.getString(6));
                        }
                    } else {
                        // go back to main menu
                    }
                } else if (choice1 == 3) {
                    System.out.println("Customer Menu \n 1) Customer Create Menu \n 2) View Customers \n 0) back");

                    int choice2 = choice.nextInt();
                    if (choice2 == 1) {
                        Scanner details = new Scanner(System.in);
                        System.out.println("Please enter the Customer details (customerID, forename, surname, address, postCode, phoneNo)  (either details for a new job or details for one that already exists)");
                        Customer customer = new Customer(details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine());
                        System.out.println("Customer create Menu \n 1) enter details into database (only new entries) \n 2) modify entry (only existing entries) \n 3) delete entry (only existing entries) \n 4) check if matching entry exists \n 0) back");

                        int choice4 = choice.nextInt();
                        if (choice4 == 1) {
                            customer.CreateCustomer(con);
                        } else if (choice4 == 2) {
                            customer.editCustomer(con);
                        } else if (choice4 == 3) {
                            customer.deleteCustomer(con);
                        } else if (choice4 == 4) {
                            customer.SearchCustomer(con);
                        } else {
                            // go back to main menu
                        }

                    } else if (choice2 == 2) {
                        String sql = "select * from Customer";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(5) + "," + rs.getString(6));
                        }
                    } else {
                        // go back to main menu
                    }
                } else if (choice1 == 4) {
                    System.out.println("Car Menu \n 1) Car Create Menu \n 2) View Cars");
                    int choice2 = choice.nextInt();
                    if (choice2 == 1) {
                        Scanner details = new Scanner(System.in);
                        System.out.println("Please enter the Car details ( regNo, make, model, year (YYYY-MM-DD), customerID)  (either details for a new job or details for one that already exists)");
                        Car car = new Car(details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine(), details.nextLine());
                        System.out.println("Car create Menu \n 1) enter details into database (only new entries) \n 2) modify entry (only existing entries) \n 3) delete entry (only existing entries) \n 4) check if matching entry exists \n 0) back");

                        int choice4 = choice.nextInt();
                        if (choice4 == 1) {
                            car.CreateCar(con);
                        } else if (choice4 == 2) {
                            car.editCar(con);
                        } else if (choice4 == 3) {
                            car.deleteCar(con);
                        } else if (choice4 == 4) {
                            car.searchCar(con);
                        } else {
                            // go back to main menu
                        }

                    } else if (choice2 == 2) {
                        String sql = "select * from Customer";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4) + "," + rs.getString(5) + "," + rs.getString(5) + "," + rs.getString(6));
                        }
                    } else {
                        // go back to main menu
                    }
                } else if (choice1 == 0) {
                    // terminates program
                    System.exit(0);
                } else {
                    //error handling
                    System.out.println("Please enter a valid number");
                }
            }

        } catch(Exception e){
            // throws since errors from the connection to database are generally not recoverable and the program is better off being closed and reopened.
            throw new RuntimeException(e);
        }
    }
}
