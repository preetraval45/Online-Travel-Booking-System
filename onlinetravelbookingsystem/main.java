import java.util.List;
import java.util.Scanner;

/**
 * Main class to control the program.
 */
public class Main {
    public static void main(String[] args) {
        // Load travel packages from file
        List<TravelPackage> packages = FileHandler.loadPackagesFromFile("packages.txt");

        Scanner scanner = new Scanner(System.in);

        // Search for travel packages by destination
        System.out.println("Enter destination to search for packages:");
        String destination = scanner.nextLine();

        System.out.println("Available packages:");
        for (TravelPackage travelPackage : packages) {
            if (travelPackage.matches(destination)) {
                travelPackage.displayDetails();
            }
        }

        // User input for booking a package
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        
        User user = new User(name, email);

        System.out.println("Enter the name of the package you want to book:");
        String packageName = scanner.nextLine();

        for (TravelPackage travelPackage : packages) {
            if (travelPackage.packageName.equalsIgnoreCase(packageName)) {
                Booking booking = new Booking(user, travelPackage);
                System.out.println("Booking successful: " + booking);
                break;
            }
        }

        scanner.close();
    }
}