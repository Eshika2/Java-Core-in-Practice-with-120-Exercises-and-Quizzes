package section3.lesson20;

public class CodingEx08 {
    public static void main(String[] args) {
        //int num = Integer.valueOf(args[0]); // do NOT change this line
        int num = 5;
        int factorial = 1;

        for (int i = 1 ; i <= num ; i++) {
            factorial *= i;
        }
        /*
            TODO
            Write a 'for' loop to calculate a factorial of the 'num'
            For example, if 'num' equals 5, then factorial of 'num' is 1 * 2 * 3 * 4 * 5
        */

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
