import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize an empty ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Check existence of a bogie
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + hasSleeper);

        // Display final bogie list
        System.out.println("Passenger bogies after removal: " + passengerBogies);
    }
}