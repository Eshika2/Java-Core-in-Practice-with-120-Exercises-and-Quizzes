package section3.lesson25;

public class Example3 {

    public static void main(String[] args) {
        //StringBuilder and StringBuffer is used for String Concatenation because its very easy this way
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println(stringBuffer.toString());
    }
}
