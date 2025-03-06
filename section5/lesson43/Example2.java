package section5.lesson43;

import java.util.LinkedList;

public class Example2 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        int firstNumber = numbers.getFirst();
        System.out.println(firstNumber);

        numbers.add(1, 10);
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);
    }
}
