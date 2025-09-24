import java.util.LinkedHashSet;

public class AppendToLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original LinkedHashSet: " + numbers);

        int elementToAppend = 50;

        numbers.add(elementToAppend);

        System.out.println("LinkedHashSet after appending " + elementToAppend + ": " + numbers);

        System.out.println("\nAttempting to add a duplicate element (30)...");
        numbers.add(30);
        System.out.println("Set after trying to add a duplicate: " + numbers);
    }
}

