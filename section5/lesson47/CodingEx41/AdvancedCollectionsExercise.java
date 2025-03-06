package section5.lesson47.CodingEx41;

import java.util.*;

public class AdvancedCollectionsExercise {

    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Initial map: " + map); // Expected output: Initial map: {}

        // TODO: Add the following key-value pairs to the map: ("Paris", 2140526), ("Berlin", 3644826), ("Madrid", 3223334)
        map.put("Paris", 2140526);
        map.put("Berlin", 3644826);
        map.put("Madrid", 3223334);

        System.out.println("After adding elements: " + map); // Expected output: After adding elements: {Paris=2140526, Berlin=3644826, Madrid=3223334}

        Integer population = map.get("Berlin"); // TODO: Retrieve the value associated with the key "Berlin"
        System.out.println("Berlin's population: " + population); // Expected output: Berlin's population: 3644826

        Integer removedPopulation = map.remove("Madrid"); // TODO: Remove the key-value pair associated with the key "Madrid" from the map
        System.out.println("Removed Madrid's population: " + removedPopulation); // Expected output: Removed Madrid's population: 3223334
        System.out.println("After removing an element: " + map); // Expected output: After removing an element: {Paris=2140526, Berlin=3644826}

        // Create a List of Strings and use Iterator to remove an element
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Initial list: " + fruits); // Expected output: Initial list: [Apple, Banana, Cherry]

        // TODO: Use an Iterator to remove the element "Banana" from the list
        Iterator <String> i = fruits.iterator();
        while(i.hasNext()) {
            String fruit = i.next();
            if (fruit.equals("Banana")) {
                i.remove();
            }
        }
        System.out.println("After removing 'Banana': " + fruits); // Expected output: After removing 'Banana': [Apple, Cherry]

        // TODO: Use a ListIterator to replace the element "Cherry" with "Grapes"
        ListIterator<String> li = fruits.listIterator();
        while(li.hasNext()) {
            String fruit = li.next();
            if(fruit.equals("Cherry")) {
                li.remove();
                li.add("Grapes");
            }
        }
        System.out.println("After modifying 'Cherry': " + fruits); // Expected output: After modifying 'Cherry': [Apple, Grapes]

        // TODO: Use a 'foreach' loop to print each element of the fruits list
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        // Expected output:
        // Apple
        // Grapes

        // TODO: Use a foreach loop to print each entry in the map
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " has population " + e.getValue());
        }
        // Expected output:
        // Paris has population 2140526
        // Berlin has population 3644826

        // TODO: implement the Comparable<Person> interface in the Person class to sort by age
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // TODO: Ensure Person class implements Comparable
        // TODO: Sort the 'people' list using Collections.sort()
        Collections.sort(people);
        // TODO: print the sorted list in the following format: "[Name] - [Age]"
        for(Person p : people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
        // Expected output:
        // Bob - 25
        // Alice - 30
        // Charlie - 35

        // TODO: Implement the Comparator<Person> interface in the PersonNameComparator class to sort by name
        // TODO: Sort the 'people' list using Collections.sort(list, comparator)
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(people, comparator);

        // TODO: print the sorted list in the following format: "[Name] - [Age]"
        for(Person p : people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
        // Expected output:
        // Alice - 30
        // Bob - 25
        // Charlie - 35

        // Use Collections utility class to perform operations
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        // TODO: Use the Collections utility class to sort a list of integers [5, 3, 8, 1, 2]
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers); // Expected output: Sorted numbers: [1, 2, 3, 5, 8]
        // TODO: Use the Collections utility class to reverse a list of integers [1, 2, 3, 5, 8]
        Collections.reverse(numbers);
        System.out.println("Reversed numbers: " + numbers); // Expected output: Reversed numbers: [8, 5, 3, 2, 1]

        // Use Arrays utility class to perform operations
        int[] array = {5, 3, 8, 1, 2};
        // TODO: Use the Arrays utility class to sort an array of integers [5, 3, 8, 1, 2]
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array)); // Expected output: Sorted array: [1, 2, 3, 5, 8]
        int index = Arrays.binarySearch(array, 3); // TODO: find the index of the element 3 using Arrays.binarySearch
        System.out.println("Index of 3 in array: " + index); // Expected output: Index of 3 in array: 2
    }
}

