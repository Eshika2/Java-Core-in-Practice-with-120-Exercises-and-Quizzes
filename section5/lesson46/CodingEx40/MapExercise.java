package section5.lesson46.CodingEx40;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Initial map: " + map); // Expected output: Initial map: {}

        // TODO: Add the following key-value pairs to the map: ("New York", 8175133), ("Los Angeles", 3792621), ("Chicago", 2695598)
        map.put("New York", 8175133);
        map.put("Los Angeles", 3792621);
        map.put("Chicago", 2695598);

        System.out.println("After adding elements: " + map); // Expected output: After adding elements: {New York=8175133, Los Angeles=3792621, Chicago=2695598}

        Integer population = map.get("Los Angeles"); // TODO: Retrieve the value associated with the key "Los Angeles"
        System.out.println("Los Angeles population: " + population); // Expected output: Los Angeles population: 3792621

        Integer removedPopulation = map.remove("Chicago"); // TODO: Remove the key-value pair associated with the key "Chicago" from the map
        System.out.println("Removed Chicago's population: " + removedPopulation); // Expected output: Removed Chicago's population: 2695598
        System.out.println("After removing an element: " + map); // Expected output: After removing an element: {New York=8175133, Los Angeles=3792621}
    }
}

