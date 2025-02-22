package section3.lesson25;

public class CodingEx17 {
    public static String concatenateStrings(String part1, String part2) {
        /*
            TODO:
            Implement the concatenateStrings method
            For example, if part1 = "Hello" and part2 = "World", the returned value of the 'concatenateStrings'
            method should be "Hello World"
            Note: there is a space between the two parts
        */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(part1);
        stringBuilder.append(" ");
        stringBuilder.append(part2);

        String result = stringBuilder.toString();

        return result;
    }

    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = concatenateStrings(part1, part2);

        System.out.println(result);
    }
}
