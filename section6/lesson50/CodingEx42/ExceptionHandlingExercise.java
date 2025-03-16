package section6.lesson50.CodingEx42;

public class ExceptionHandlingExercise {
    public static void main(String[] args) {
        // TODO: wrap this with try-catch to handle the exceptions
        try {
            dangerousMethod(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Argument not allowed");
        } catch(Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }

    public static void dangerousMethod(String input) throws Exception {
        if (input.equals("number")) {
            throw new NumberFormatException();
        } else if (input.equals("illegal")) {
            throw new IllegalArgumentException();
        } else {
            throw new Exception("Unknown exception");
        }
    }
}
