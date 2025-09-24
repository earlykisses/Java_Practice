import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchValueInTreeMapiterator {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Elements in the list:");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

