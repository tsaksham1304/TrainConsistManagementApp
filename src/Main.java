import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // Create a list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Executive", 80));

        // Display original list
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Streams
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (capacity > 60):");
        highCapacityBogies.forEach(System.out::println);

        // Ensure original list remains unchanged
        System.out.println("\nOriginal list after filtering (unchanged):");
        bogies.forEach(System.out::println);
    }
}