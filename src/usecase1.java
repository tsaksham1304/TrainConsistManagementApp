import java.util.*;

class Bogie {
    String id;
    int capacity;

    Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

public class usecase1{
    public static void main(String[] args) {
        List<Bogie> train = new ArrayList<>();

        train.add(new Bogie("B1", 50));
        train.add(new Bogie("B2", 60));

        int totalCapacity = 0;
        for (Bogie b : train) {
            totalCapacity += b.capacity;
        }

        System.out.println("Total Bogies: " + train.size());
        System.out.println("Total Capacity: " + totalCapacity);
    }
}