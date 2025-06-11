import java.util.Date;

public class Flight {
    public String FlightID;
    public String FlightNumber;
    public String DepartureAirport;
    public String ArrivalAirport;
    public String DepartureDateTime;
    public String ArrivalDateTime;

    public Flight(String FlightID, String FlightNumber, String departureAirport, String arrivalAirport, String DepartureDateTime, String ArrivalDateTime) {
        this.FlightID = FlightID;
        this.FlightNumber = FlightNumber;
        this.DepartureAirport = departureAirport;
        this.ArrivalAirport = arrivalAirport;
        this.DepartureDateTime = DepartureDateTime;
        this.ArrivalDateTime = ArrivalDateTime;
    }
}

