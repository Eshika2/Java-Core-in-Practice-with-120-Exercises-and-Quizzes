package section4.lesson38.CodingEx33;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.assignName("Dolly");
        String name = dog.retrieveName();
        System.out.println(name);
    }
}
