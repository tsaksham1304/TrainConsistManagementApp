import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;  // e.g., Cylindrical, Box, Open
    String cargo; // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " bogie carrying " + cargo;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Prepare list of goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Open", "Grain"),
                new GoodsBogie("Cylindrical", "Petroleum")
                // Uncomment below to test unsafe case:
                // new GoodsBogie("Cylindrical", "Coal")
        );

        // 2️⃣ Stream + allMatch to validate safety rules
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // Other bogies have no restrictions
                });

        // 3️⃣ Display result
        if (isSafe) {
            System.out.println("Train is SAFE for operation ✅");
        } else {
            System.out.println("Train is UNSAFE! ❌ Some bogies violate cargo rules.");
        }

        // Optional: Print the bogies for reference
        System.out.println("Goods bogie list:");
        goodsBogies.forEach(System.out::println);
    }
}