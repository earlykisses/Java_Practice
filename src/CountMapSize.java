import java.util.HashMap;
import java.util.Map;

public class CountMapSize {

    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();

        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("UK", "London");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Germany", "Berlin");

        System.out.println("Map of capital cities: " + capitalCities);

        int mapSize = capitalCities.size();

        System.out.println("\nThe number of key-value mappings in the map is: " + mapSize);
    }
}


