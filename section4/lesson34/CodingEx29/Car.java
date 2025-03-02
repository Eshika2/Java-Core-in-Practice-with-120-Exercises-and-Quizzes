package section4.lesson34.CodingEx29;

// TODO: Car class should extend Vehicle class
public class Car extends Vehicle{

    // TODO: Define a constructor that calls super to initialize the properties (pass "Car" as type to the super constructor)
    public Car(String model, int year) {
        super(model, year, "Car");

    }

    // TODO: Implement the startEngine method
    @Override
    public void startEngine() {
        System.out.println("The car engine is starting");
    }
}

