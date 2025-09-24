import java.util.TreeSet;

public class AddAllToTreeSet {

    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");
        set1.add("White");
        System.out.println("First TreeSet: " + set1);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Orange");
        System.out.println("Second TreeSet: " + set2);

        set2.addAll(set1);

        System.out.println("\nSecond TreeSet after adding all elements from the first set: " + set2);
    }
}

