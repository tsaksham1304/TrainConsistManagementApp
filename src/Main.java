import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Prepare a list of bogies (can be scaled up for benchmarking)
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100) + 1)); // capacities 1 to 100
        }

        // 2️⃣ Loop-based filtering: capacity > 60
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        System.out.println("Loop-based filtering result size: " + loopFiltered.size());
        System.out.println("Loop execution time (ns): " + loopTime);

        // 3️⃣ Stream-based filtering: capacity > 60
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        System.out.println("Stream-based filtering result size: " + streamFiltered.size());
        System.out.println("Stream execution time (ns): " + streamTime);

        // 4️⃣ Optional: Compare results
        System.out.println("Results identical: " + loopFiltered.equals(streamFiltered));
    }
}