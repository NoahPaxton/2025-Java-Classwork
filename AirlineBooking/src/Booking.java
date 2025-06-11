import java.util.Date;

public class Booking {
    private String bookingID;
    private String bookingDate;

    public Booking(String bookingID, String bookingDate) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
    }
    public String getBookingID() {
        return bookingID;
    }
    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;

    }

}
