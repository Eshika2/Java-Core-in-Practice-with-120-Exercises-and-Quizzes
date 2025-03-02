package section4.lesson33.CodingEx28;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new Car();
        electricVehicle.start();
        electricVehicle.stop();
        electricVehicle.charge();
        electricVehicle.honk();
        Vehicle.displayType();
    }
}
//Define an interface Vehicle with the following methods:
//
//void start()
//
//void stop()
//
//default void honk(): Prints "Honking..."
//
//static void displayType(): Prints "Vehicle Type"
//
//Define an interface ElectricVehicle that extends Vehicle and adds:
//
//void charge()
//
//Implement a class Car that implements the ElectricVehicle interface and provides concrete implementations for start, stop, and charge methods.
//
//Expected outputs for each method:
//
//start(): Prints "Car is starting"
//
//stop(): Prints "Car is stopping"
//
//charge(): Prints "Car is charging"
//
//honk(): Prints "Honking..."
//
//displayType(): Prints "Vehicle Type"