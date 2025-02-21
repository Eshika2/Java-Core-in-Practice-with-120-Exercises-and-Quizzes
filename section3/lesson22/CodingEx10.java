package section3.lesson22;

import java.util.Arrays;

public class CodingEx10 {
    public static int[] initializeArray() {
        // TODO: Implement this method to return an array with values {1, 2, 3, 4, 5}
        int[] arr = {1, 2, 3, 4, 5};

        return arr;
    }

    public static void main(String[] args) {
        int[] results = initializeArray();
        System.out.println("Array : " + Arrays.toString(results));
    }
}
