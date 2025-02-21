package section3.lesson21;

public class CodingEx09 {
    // TODO: Define a method named 'sum' that takes two ints as arguments and returns their sum
    public static int sum (int number1, int number2) {
        return number1 + number2;
    }


    public static void main(String[] args) {
        int number1 = Integer.valueOf(args[0]); // do NOT change this line
        int number2 = Integer.valueOf(args[1]); // do NOT change this line

        int result;

        // TODO: assign the result of the 'sum' method, called with 'number1' and 'number2' arguments to the 'result' variable
        result = sum(number1, number2);

        System.out.println("The sum is: " + result);
    }    
}
