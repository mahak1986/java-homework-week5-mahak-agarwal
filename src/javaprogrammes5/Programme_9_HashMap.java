package javaprogrammes5;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {

    public static void main(String[] args) {
        keyValue();

    }

    public static void keyValue() {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> people = new HashMap();
        // Add some key-value pairs to the map
        people.put("Mahak", 30);
        people.put("Aarav", 7);
        people.put("Tarun", 40);
        // Iterate through the values using a for-each loop
        for ( Map.Entry<String,Integer> name: people.entrySet()) {
            System.out.println(name.getKey() + " = " + name.getValue());
        }
    }
}
