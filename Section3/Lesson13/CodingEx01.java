package Section3.Lesson13;

public class CodingEx01 {
    public static void main(String[] args) {

        int number = 42;
        double price = 12.99;
        boolean isAvailable = true;
        char grade = 'A';
        String name = "Alice";

        // Use print and println methods here
        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + isAvailable);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.print("Formatted Output: ");
        // Use printf method here
        System.out.printf("Name: %s, Number: %d, Price: %.2f, Availability: %b, Grade: %c" ,name, number, price, isAvailable, grade);

    }
}
