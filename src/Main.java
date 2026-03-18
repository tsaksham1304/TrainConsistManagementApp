import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize LinkedHashSet to store unique bogies while preserving order
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("Train formation (insertion order preserved, duplicates ignored):");
        System.out.println(trainFormation);
    }
}