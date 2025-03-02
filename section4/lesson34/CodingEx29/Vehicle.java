package section4.lesson34.CodingEx29;

// TODO: make the class abstract
public abstract class Vehicle {

    // TODO: Define properties 'model' (String), 'year' (int), and 'type' (String) with the default access modifier
    String model;
    int year;
    String type;

    // TODO: Define a constructor that initializes the properties
    public Vehicle(String model, int year, String type) {
        this.year = year;
        this.model = model;
        this.type = type;
    }

    // TODO: Declare an abstract void method startEngine()
    public abstract void startEngine();
}

