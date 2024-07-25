/**
 * Abstract class representing a base travel package.
 */
public abstract class BasePackage {
    protected String packageName;
    protected double price;
    protected int duration; // in days

    /**
     * Constructor for BasePackage.
     * 
     * @param packageName the name of the package
     * @param price the price of the package
     * @param duration the duration of the package in days
     */
    public BasePackage(String packageName, double price, int duration) {
        this.packageName = packageName;
        this.price = price;
        this.duration = duration;
    }

    /**
     * Abstract method to display package details.
     * Must be implemented by subclasses.
     */
    public abstract void displayDetails();

    @Override
    public String toString() {
        return "Package: " + packageName + ", Price: " + price + ", Duration: " + duration + " days";
    }
}