import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 50);

        // Display bogie capacities
        System.out.println("Bogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue() + " seats");
        }
    }
}