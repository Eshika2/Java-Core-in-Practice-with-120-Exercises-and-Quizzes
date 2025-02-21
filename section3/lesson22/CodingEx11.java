package section3.lesson22;
import java.util.Arrays;

public class CodingEx11 {
    public static void printArrayElements(int[] array) {
        // TODO: Implement this method to print all elements of the array using System.out.println
        for(int i=0 ; i<array.length ; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        for (int numbers : array) {
            System.out.println(numbers);
        }
    }

    public static void main(String[] args) {
        int[] array =  CodingEx10.initializeArray();
        printArrayElements(array);
    }
}
