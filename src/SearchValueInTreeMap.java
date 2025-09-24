import java.util.TreeMap;

public class SearchValueInTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "White");
        treeMap.put(5, "Blue");

        String valueToSearch = "Green";

        if (treeMap.containsValue(valueToSearch)) {
            System.out.println("The TreeMap contains the value: " + valueToSearch);
        } else {
            System.out.println("The TreeMap does not contain the value: " + valueToSearch);
        }

        String anotherValueToSearch = "Orange";

        if (treeMap.containsValue(anotherValueToSearch)) {
            System.out.println("The TreeMap contains the value: " + anotherValueToSearch);
        } else {
            System.out.println("The TreeMap does not contain the value: " + anotherValueToSearch);
        }
    }
}
