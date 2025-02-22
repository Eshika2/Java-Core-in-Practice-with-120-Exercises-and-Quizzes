package section3.lesson23;

public class CodingEx15 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // Complete the following comparisons
        boolean compare1 = str1 == str2; // TODO: Compare str1 and str2 using ==
        boolean compare2 = str3 == str4; // TODO: Compare str3 and str4 using ==
        boolean compare3 = str1.equals(str2); // TODO: Compare str1 and str3 using equals()

        System.out.println("compare1: " + compare1); // true
        System.out.println("compare2: " + compare2); // false
        System.out.println("compare3: " + compare3); // true
    }
}
