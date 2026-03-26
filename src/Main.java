import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        // Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));

        // Display bogies before sorting
        System.out.println("Before sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display bogies after sorting
        System.out.println("\nAfter sorting by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}