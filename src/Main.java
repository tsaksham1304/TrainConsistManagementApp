import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // Step 1: Create a list of Bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Executive", 80));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Display original list
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // Step 3: Group bogies by type using Stream API
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Step 4: Display grouped bogies
        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " => " + list);
        });

        // Step 5: Verify original list remains unchanged
        System.out.println("\nOriginal list after grouping (unchanged):");
        bogies.forEach(System.out::println);
    }
}