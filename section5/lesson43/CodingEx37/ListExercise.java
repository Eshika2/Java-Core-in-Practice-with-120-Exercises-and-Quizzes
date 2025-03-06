package section5.lesson43.CodingEx37;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> arrayList = new ArrayList<>();
        System.out.println("Initial ArrayList: " + arrayList);

        // TODO: Add the following elements to the arrayList: "Apple", "Banana", "Cherry"
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("After adding elements: " + arrayList);

        // TODO: Insert the element "Blueberry" at the second position (index 1) of the arrayList
        arrayList.add(1, "Blueberry");

        System.out.println("After inserting element at index 1: " + arrayList);

        // TODO: Remove the third element (index 2) from the arrayList
        arrayList.remove(2);

        System.out.println("After removing element at index 2: " + arrayList);

        String element = arrayList.get(1);// TODO: Retrieve the element at index 1 of the arrayList
        System.out.println("Element at index 1: " + element);

        // Create a LinkedList of Integers
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Initial LinkedList: " + linkedList);

        // TODO: Add the following elements to the linkedList: 1, 3, 5
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);

        System.out.println("After adding elements: " + linkedList);

        // TODO: Insert the element 2 at the second position (index 1) of the linkedList
        linkedList.add(1, 2);

        System.out.println("After inserting element at index 1: " + linkedList);

        // TODO: Remove the third element (index 2) from the linkedList
        linkedList.remove(2);

        System.out.println("After removing element at index 2: " + linkedList);

        int number = linkedList.getFirst(); // TODO: Retrieve the element at index 0 of the linkedList
        System.out.println("Element at index 0: " + number);
    }
}

