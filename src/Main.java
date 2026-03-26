import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user input
        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainID = sc.nextLine();

        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainIDPattern = "TRN-\\d{4}";       // TRN- followed by exactly 4 digits
        String cargoCodePattern = "PET-[A-Z]{2}";   // PET- followed by exactly 2 uppercase letters

        // Step 3: Compile patterns
        Pattern trainPattern = Pattern.compile(trainIDPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Step 4: Match input
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate and display result
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid ✅");
        } else {
            System.out.println("Train ID is invalid ❌");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid ✅");
        } else {
            System.out.println("Cargo Code is invalid ❌");
        }

        sc.close();
    }
}