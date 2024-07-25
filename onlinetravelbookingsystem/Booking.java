import java.util.Date;

/**
 * Class representing a booking.
 */
public class Booking {
    private User user;
    private TravelPackage travelPackage;
    private Date bookingDate;

    /**
     * Constructor for Booking.
     * 
     * @param user the user making the booking
     * @param travelPackage the travel package being booked
     */
    public Booking(User user, TravelPackage travelPackage) {
        this.user = user;
        this.travelPackage = travelPackage;
        this.bookingDate = new Date(); // Current date
    }

    @Override
    public String toString() {
        return "Booking [User=" + user.getName() + ", Package=" + travelPackage.packageName + ", Date=" + bookingDate + "]";
    }
}