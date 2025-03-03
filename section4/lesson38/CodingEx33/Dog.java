package section4.lesson38.CodingEx33;

// TODO: Dog should extend Animal
public class Dog extends Animal{

    // TODO: create a method 'assignName' that takes a String parameter
    //  and uses the 'setName' method of the Animal class to set the name
    public void assignName(String name) {
        setName(name);
    }
    // TODO: create a method 'retrieveName' that returns the name of the animal
    public String retrieveName() {
        return name;
    }
}
