package section3.lesson18;

public class CodingEx03 {
    public static void main(String[] args) {
        //int number = Integer.valueOf(args[0]); // do NOT change this line
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
        /*
            TODO:
            if the number is positive, print "The number is positive"
            if the number is negative, print "The number is negative"
            if the number is zero, print "The number is zero"
        */
    }
}
//if-else Statements
//Write a Java program that checks if a given number is positive, negative, or zero using if-else statements.
//
//Use if-else statements to print:
//
//"The number is positive" if the number is greater than zero.
//
//"The number is negative" if the number is less than zero.
//
//"The number is zero" if the number is equal to zero.
//
//Replace the placeholder comment in the template with the correct if-else statements to achieve this functionality.