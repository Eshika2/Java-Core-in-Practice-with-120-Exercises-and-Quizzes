package section4.lesson31.CodingEx22;

public class MathHelper {
    // TODO: Define a static variable called 'PI' with the value of 3.14
    static double PI = 3.14;
    // TODO: Define a static method 'square' that takes an integer and returns its square
    static int square (int num) {
        return num * num;
    }
    public static void main(String[] args) {
        // TODO: Uncomment the lines below after implementing the static variable and method
        System.out.println("The value of PI is: " + MathHelper.PI);
        int result = MathHelper.square(5);
        System.out.println("The square of 5 is: " + result);
    }
}
