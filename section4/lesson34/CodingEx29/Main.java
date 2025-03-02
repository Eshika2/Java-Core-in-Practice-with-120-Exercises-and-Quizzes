package section4.lesson34.CodingEx29;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2025);
        System.out.println("Model : " + car.model);
        System.out.println("Year : " + car.year);
        System.out.println("Type : " + car.type);
        car.startEngine();
    }
}
//Define an abstract class Vehicle with the following properties:
//
//String model
//
//int year
//
//String type
//
//A constructor that initializes these properties.
//
//Declare an abstract method startEngine() in the Vehicle class.
//
//Create a subclass Car that extends the Vehicle class.
//
//Implement the startEngine() method in the Car class to print "The car engine is starting".
//
//Ensure the Car class has a constructor that initializes the model and year properties,
// and sets the type property to "Car".
//
//Use the super keyword in the Car constructor to call the constructor of the Vehicle class.