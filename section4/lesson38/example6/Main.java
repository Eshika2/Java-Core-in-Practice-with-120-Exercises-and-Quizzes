package section4.lesson38.example6;

public class Main {

    public static void main(String[] args) {
        Greeting hello = new Greeting() {
            public void greet() {
                System.out.println("Hello");
            }
        };

        hello.greet();
    }
}
