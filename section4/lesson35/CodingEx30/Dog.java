package section4.lesson35.CodingEx30;

// TODO: This class should extend the Mammal abstract class and implement the Animal interface
public class Dog extends Mammal implements Animal{

    // TODO: Implement the methods
    @Override
    public void sound() {
        System.out.println("Bark");
    }
    @Override
    public void habitat() {
        System.out.println("Domestic");
    }

    @Override
    void description() {
        super.description();
    }
}

