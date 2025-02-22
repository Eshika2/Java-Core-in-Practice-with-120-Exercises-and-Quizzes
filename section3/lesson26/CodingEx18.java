package section3.lesson26;

public class CodingEx18 {
    public static boolean compareStrings(String str1, String str2, boolean ignoreCase) {
        // TODO: Implement this method
        if (ignoreCase) {
            if (str1.equalsIgnoreCase(str2)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (str1.equals(str2)) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
// If ignoreCase is true,
// the method should compare the two strings ignoring their case using the equalsIgnoreCase() method.
// If ignoreCase is false,
// the method should compare the two strings considering their case using the equals() method.
// The method should return true
// if the strings are equal based on the specified comparison method, and false otherwise.