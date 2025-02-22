package section3.lesson27;

public class CodingEx19 {
    // Implement the method to format a string using the String.format() method.
    public static String formatString(String name, int age, float price) {
        // TODO: Implement this method

        return String.format("My name is %s, I am %d years old, and the price is $%.2f.", name, age, price); // Placeholder return statement
    }
}
//Implement the formatString method in the StringFormatter class.
//This method takes a string (name), an integer (age), and a float (price).
//It should use the String.format() method to format these values into a single string
//with the following format: "My name is [name], I am [age] years old, and the price is $[price].".
//The price should be formatted to two decimal places.