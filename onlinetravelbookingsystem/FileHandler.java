import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for handling file I/O operations.
 */
public class FileHandler{
    /**
     * Loads travel packages from a file.
     * 
     * @param filename the name of the file to load packages from
     * @return a list of TravelPackage objects
     */
    public static List<TravelPackage> loadPackagesFromFile(String filename) {
        List<TravelPackage> packages = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                packages.add(new TravelPackage(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]), parts[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return packages;
    }
}