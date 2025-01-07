import java.util.HashMap;

public class MapSizeDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Display the map
        System.out.println("Map: " + map);
        // Count the number of key-value mappings
        int size = map.size();
        System.out.println("Number of key-value mappings: " + size);
    }
}
