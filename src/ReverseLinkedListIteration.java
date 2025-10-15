import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");

        System.out.println("Original LinkedList: " + languages);

        Iterator<String> it = languages.descendingIterator();

        System.out.println("\nElements in reverse order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}