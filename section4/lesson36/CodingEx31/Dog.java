package section4.lesson36.CodingEx31;

// TODO: the Dog class should extend the Animal class
public class Dog extends Animal{
    // TODO: Add the specific attribute 'breed' (String) for Dog class
    private String breed;

    // TODO: Add the constructor for Dog class that takes name, age, and breed as parameters and
    //  calls the constructor of the Animal class using super
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // TODO: Add the getter for the 'breed' attribute (public String getBreed())
    public String getBreed() {
        return breed;
    }

    // TODO: Add the method 'bark' for Dog class that prints "The dog is barking"
    public void bark() {
        System.out.println("The dog is barking");
    }
}
