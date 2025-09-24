import java.util.ArrayList;

public class InsertAtFirst {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Original ArrayList: " + fruits);

        String newFruit = "Orange";

        fruits.add(0, newFruit);

        System.out.println("ArrayList after insertion: " + fruits);
    }
}


