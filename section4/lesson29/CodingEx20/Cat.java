package section4.lesson29.CodingEx20;

public class Cat {
    /*
        TODO: Define the fields
        Add three fields of different types:
        1. a String for the 'name'
        2. an int for the 'age'
        3. a boolean for 'isIndoorCat'
    */
    String name;
    int age;
    boolean isIndoorCat;

    // TODO: Define a method meow() that prints "Meow" to the console
    void meow () {
        System.out.println("Meow");
    }
    // TODO: Define a method printName() that prints the cat's name to the console
    //  in the format: "Name: [name]", for example, "Name: Kitty"
    void printName () {
        System.out.println("Name: " + name);
    }
}
