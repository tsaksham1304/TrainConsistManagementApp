import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize a LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies at the end
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Train consist after initial addition: " + trainConsist);

        // Insert Pantry Car at position 2 (index starts at 0)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie: " + trainConsist);
    }
}