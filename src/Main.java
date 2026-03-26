import java.util.ArrayList;
import java.util.List;

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

        // Step 1: Create list of bogies
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

        // Step 3: Calculate total seating capacity using Stream + map + reduce
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)       // Extract capacity of each bogie
                .reduce(0, Integer::sum);      // Sum all capacities

        // Step 4: Display total seats
        System.out.println("\nTotal Seating Capacity of the Train: " + totalSeats);
    }
}