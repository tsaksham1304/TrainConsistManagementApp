import java.util.*;

class Bogie {
    String id;

    Bogie(String id) {
        this.id = id;
    }
}

public class usecase2 {
    public static void main(String[] args) {
        ArrayList<Bogie> train = new ArrayList<>();

        train.add(new Bogie("B1"));
        train.add(new Bogie("B2"));
        train.add(new Bogie("B3"));

        for (Bogie b : train) {
            System.out.println("Bogie ID: " + b.id);
        }
    }
}