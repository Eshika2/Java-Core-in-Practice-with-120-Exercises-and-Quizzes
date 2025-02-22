package section3.lesson24;

public class CodingEx16 {
    public static void main(String[] args) {
        // You can use this main method to test your code
        String s = "HelloWorld";
        System.out.println(getLength(s));
        System.out.println(getCharAt(s, 0));
        System.out.println(getIndexOf(s, 'o'));
    }

    // TODO: Implement the methods below

    public static int getLength(String s) {
        // Implement this method to return the length of the string
        int length = s.length();
        return length;
    }

    public static char getCharAt(String s, int index) {
        // Implement this method to return the character at the specified index
        char character = s.charAt(index);
        return character;
    }

    public static int getIndexOf(String s, char ch) {
        // Implement this method to return the index of the first occurrence of the specified character
        int ind = s.indexOf(ch);
        return ind;
    }
}
