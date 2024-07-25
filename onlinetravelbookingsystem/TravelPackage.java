/**
 * Class representing a travel package.
 * Inherits from BasePackage and implements Searchable interface.
 */
public class TravelPackage extends BasePackage implements Searchable {
    private String destination;

    /**
     * Constructor for TravelPackage.
     * 
     * @param packageName the name of the package
     * @param price the price of the package
     * @param duration the duration of the package in days
     * @param destination the destination of the package
     */
    public TravelPackage(String packageName, double price, int duration, String destination) {
        super(packageName, price, duration);
        this.destination = destination;
    }

    @Override
    public void displayDetails() {
        System.out.println(toString() + ", Destination: " + destination);
    }

    @Override
    public boolean matches(String criteria) {
        return destination.equalsIgnoreCase(criteria);
    }
}