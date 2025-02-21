package section3.lesson15;

public class CodingEx02 {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        // Perform arithmetic operations
        int additionResult = a + b; // Addition of a and b
        int subtractionResult = a - b;      // TODO: Subtraction of b from a
        int multiplicationResult = a * b;   // TODO: Multiplication of a and b
        int divisionResult = a / b;         // TODO: Division of a by b
        int remainderResult = a % b;        // TODO: Remainder of a divided by b

        // Perform comparison operations
        boolean isEqual = a == b; // Check if a is equal to b
        boolean isNotEqual = a != b;       // TODO: Check if a is not equal to b
        boolean isGreaterThan = a > b;    // TODO: Check if a is greater than b
        boolean isLessThan = a < b;       // TODO: Check if a is less than b
        boolean isGreaterOrEqual = a >= b; // TODO: Check if a is greater than or equal to b
        boolean isLessOrEqual = a <= b;    // TODO: Check if a is less than or equal to b

        // Perform logical operations
        boolean andResult = a > 0 && b > 0; // TODO: Logical AND: Check if both a and b are greater than 0
        boolean orResult = a > 0 || b > 0;  // TODO: Logical OR: Check if either a or b is greater than 0
        boolean notResult = !(a < 0);  // TODO: Logical NOT: Check if a is not less than 0

        // Perform assignment operations
        int assign = a;
        assign += b; // += operator: add b to assign
        assign -= b;// TODO: use -= operator: subtract b from assign
        assign *= b;// TODO: use *= operator: multiply assign by b
        assign /= b;// TODO: use /= operator: divide assign by b

        // Print the results (don't change the code below)
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Remainder: " + remainderResult);

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);

        System.out.println("Assignment Operations Result: " + assign);
    }
}
