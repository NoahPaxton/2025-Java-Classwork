import java.io.*;
import java.text.*;
import java.util.*;
public class Main {

    public static String[] ConstructHelperCustomer() {
        //Method used to make code neater.
        String [] con = new String [6];
        System.out.println("Please enter the customer ID");
        Scanner sc = new Scanner(System.in);
        con[0] = sc.nextLine();
        System.out.println("Please enter the first name");
        con[1] = sc.nextLine();
        System.out.println("Please enter the last name");
        con[2] = sc.nextLine();
        System.out.println("Please enter the email");
        con[3] = sc.nextLine();
        System.out.println("Please enter the phone number");
        con[4] = sc.nextLine();
        System.out.println("Please enter the address");
        con[5] = sc.nextLine();
        return con;
    }

    public static String[] ConstructHelperBooking() {
        //Method used to make the code neater.
        String [] con = new String [2];
        System.out.println("Please enter the booking ID");
        Scanner sc = new Scanner(System.in);
        con[0] = sc.nextLine();
        System.out.println("Please enter the booking date, (YYYY-MM-DD)");
        con[1] = sc.nextLine();
        return con;
    }

    public static String[] ConstructHelperFlight() {
        //Method used to make the code neater.
        String [] con = new String [6];
        System.out.println("Please enter the flight ID");
        Scanner sc = new Scanner(System.in);
        con[0] = sc.nextLine();
        System.out.println("Please enter the flight number");
        con[1] = sc.nextLine();
        System.out.println("Please enter the Departure Airport");
        con[2] = sc.nextLine();
        System.out.println("Please enter the Arrival Airport");
        con[3] = sc.nextLine();
        System.out.println("Please enter the Departure Time (HH:MM:SS)");
        con[4] = sc.nextLine();
        System.out.println("Please enter the Arrival Time (HH:MM:SS)");
        con[5] = sc.nextLine();
        return con;
    }
    public static String[] ConstructHelperRoute() {
        //Method used to make the code neater.
        String [] con = new String [2];
        System.out.println("Please enter the route ID");
        Scanner sc = new Scanner(System.in);
        con[0] = sc.nextLine();
        System.out.println("Please enter the Route number");
        con[1] = sc.nextLine();
        return con;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Main Menu \n 1) create/modify Customer.csv \n 2) create/modify Booking.csv \n 3) create/modify Flight.csv \n 4) create/modify Route.csv \n 5) exit");
            Scanner MainMenu = new Scanner(System.in);
            String MainMenuChoice = MainMenu.nextLine();
            int i = 0;
            // Main menu system using if loop.
            if (MainMenuChoice.equals("1")) {
                while (i == 0) {
                    try {
                        //Runs the method to help construct Customer
                        String[] ConCus = ConstructHelperCustomer();
                        // create the customer
                        Customer customer = new Customer(ConCus[0], ConCus[1], ConCus[2], ConCus[3], ConCus[4], ConCus[5]);
                        FileWriter customercsv = new FileWriter("Customer.csv", true);
                        customercsv.write(customer.getCustomerID() + "," + customer.getFirstName() + "," + customer.getLastName() + "," + customer.getEmail() + "," + customer.getPhone() + "," + customer.getAddress() + "\n");
                        System.out.println("Do you want to add another customer?");
                        Scanner sc = new Scanner(System.in);
                        String choice = sc.nextLine();
                        // Loop used to choose whether you want to create another customer in the csv
                        if (choice.equals("yes")) {
                            // Do nothing
                        } else if (choice.equals("no")) {
                            i++;
                            customercsv.close();
                        } else {
                            System.out.println("Please enter either 'yes' or 'no'");
                        }
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                }
            } else if (MainMenuChoice.equals("2")) {
                while (i == 0) {
                    try {
                        // Runs the method to help construct Booking
                        String[] ConBooking = ConstructHelperBooking();
                        String date = ConBooking[1];
                        // validating the date input
                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        Date dateParsed = formatter.parse(date);
                        // Create the booking
                        Booking booking = new Booking(ConBooking[0], ConBooking[1]);
                        Scanner sc = new Scanner(System.in);
                        //Create or open file
                        FileWriter bookingcsv = new FileWriter("Booking.csv", true);
                        //Writing the file to the csv
                        bookingcsv.write(booking.getBookingID() + "," + booking.getBookingDate() + '\n');
                        // Loop used to choose whether you want to create another booking in the csv
                        System.out.println("Do you want to add another booking?");
                        String choice = sc.nextLine();
                        if (choice.equals("yes")) {
                                // Do Nothing
                            } else if (choice.equals("no")) {
                                i++;
                                bookingcsv.close();
                            } else {
                                System.out.println("Please enter either 'yes' or 'no'");
                            }
                    } catch (ParseException e) {
                         System.out.println("Invalid Date Format, please try again");
                         System.out.println("Please enter a valid date \n" + e.getMessage());

                    } catch (IOException e) {
                        System.out.println("issue creating or accessing file. do you have permission? \n" + e.getMessage());
                    }
                }

            } else if (MainMenuChoice.equals("3")) {
                while (i == 0) {
                    try {
                        String[] ConFlight = ConstructHelperFlight();
                        // Validate time
                        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                        String ArrivalUnparsed = ConFlight[4];
                        String DepartureUnparsed = ConFlight[5];
                        formatter.parse(ArrivalUnparsed);
                        formatter.parse(DepartureUnparsed);
                        // Create the Array
                        Flight flight = new Flight(ConFlight[0], ConFlight[1], ConFlight[2], ConFlight[3], ConFlight[4], ConFlight[5]);
                        // create/open file
                        FileWriter flightcsv = new FileWriter("Flight.csv", true);
                        flightcsv.write(flight.FlightID + "," + flight.FlightNumber + "," + flight.DepartureAirport + "," + flight.ArrivalAirport + "," + flight.DepartureDateTime + "," + flight.ArrivalDateTime + "\n");
                        Scanner sc = new Scanner(System.in);
                        String choice = sc.nextLine();
                        // Loop used to choose whether you want to create another flight in the csv
                        System.out.println("Do you want to add another flight?");
                        if (choice.equals("yes")) {
                            // Do nothing
                        } else if (choice.equals("no")) {
                            i++;
                            // Close file
                            flightcsv.close();

                        } else {
                            System.out.println("Please enter either 'yes' or 'no'");
                        }
                    } catch (ParseException e) {
                        System.out.println("Please enter a valid time");
                        throw new RuntimeException(e);
                    } catch (Exception e) {
                        System.out.println("issue creating or accessing file. do you have permission?");
                        throw new IOException();
                    }

                }
            } else if (MainMenuChoice.equals("4")) {
                while (i == 0) {
                    try {
                        // Calling method to help construct Route
                        String[] ConRoute = ConstructHelperRoute();
                        // Creating the Array
                        Route route = new Route(ConRoute[0], ConRoute[1]);
                        // Create/Open file
                        FileWriter routecsv = new FileWriter("Route.csv", true);
                        // Write to file
                        routecsv.write(route.getRouteID() + "," + route.getRouteName() + "\n");
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Do you want to add another route?");
                        String choice = sc.nextLine();
                        // Loop used to choose whether you want to create another route in the csv
                        if (choice.equals("yes")) {
                            // Do nothing
                        } else if (choice.equals("no")) {
                            i++;
                            // Close file
                            routecsv.close();
                        } else {
                            System.out.println("Please enter either 'yes' or 'no'");
                        }
                    } catch (Exception e) {
                        System.out.println("issue creating or accessing file. do you have permission?");
                        throw new IOException(e);

                    }
                }
            } else if (MainMenuChoice.equals("5")) {
                //exits the program
                System.exit(0);
            } else {
                // if the input choice doesn't match 1,2 3, 4, or 5
                System.out.println("Invalid Choice. Try Again");
            }

        }
    }
}

