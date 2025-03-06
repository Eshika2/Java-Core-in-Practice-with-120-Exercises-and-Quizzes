package section5.lesson44.CodingEx38;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExercise {

    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> hashSet = new HashSet<>();
        System.out.println("Initial HashSet: " + hashSet);

        // TODO: Add the following elements to the hashSet: "Apple", "Banana", "Cherry"
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // This should print ["Apple", "Banana", "Cherry"] in any order
        System.out.println("After adding elements: " + hashSet);

        // TODO: Add a duplicate element "Banana" to the hashSet
        hashSet.add("Banana");
        // This should print ["Apple", "Banana", "Cherry"] in any order
        System.out.println("After adding a duplicate element: " + hashSet);

        // TODO: Remove the element "Cherry" from the hashSet
        hashSet.remove("Cherry");
        // This should print ["Apple", "Banana"] in any order
        System.out.println("After removing an element: " + hashSet);

        boolean contains = hashSet.contains("Apple"); // TODO: Check if the hashSet contains the element "Apple"
        // This should print 'true'
        System.out.println("Contains 'Apple': " + contains);

        // Create a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>();
        // This should print "[]"
        System.out.println("Initial TreeSet: " + treeSet);

        // TODO: Add the following elements to the treeSet: 1, 3, 2
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        // This should print [1, 2, 3] (sorted)
        System.out.println("After adding elements: " + treeSet);

        // TODO: Add a duplicate element 3 to the treeSet
        treeSet.add(3);
        // This should print [1, 2, 3]
        System.out.println("After adding a duplicate element: " + treeSet);

        // TODO: Remove the element 2 from the treeSet
        treeSet.remove(2);
        // This should print [1, 3]
        System.out.println("After removing an element: " + treeSet);

        contains = treeSet.contains(1); // TODO: Check if the treeSet contains the element 1
        // This should print 'true'
        System.out.println("Contains 1: " + contains);
    }
}

