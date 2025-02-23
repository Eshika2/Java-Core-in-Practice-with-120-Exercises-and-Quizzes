package section4.lesson30.CodingEx21;

public class Main {
    public static Car createCar() {
        // TODO: Create a new Car object, set its variables, and return it
        Car car = new Car();
        car.modelYear = 2024;
        car.modelName = "Tesla Model S";

        return car;
    }

    public static int getModelYear(Car car) {
        // TODO: return the model year of the car
        return car.modelYear;
    }

    public static String getModelName(Car car) {
        // TODO: return the model name of the car
        return car.modelName;
    }

    public static void honk(Car car) {
        // TODO: call the honk method on the car object
        car.honk();
    }
}
//Complete the createCar method in the Main class. This method should:
//
//Create a new Car object.
//
//Set the modelYear to 2024.
//
//Set the modelName to "Tesla Model S".
//
//Return the Car object.
//
//Implement the getModelYear method to return the modelYear of the given Car object.
//
//Implement the getModelName method to return the modelName of the given Car object.
//
//Implement the honk method to call the honk method on the given Car object, which prints "Honk! Honk!" to the console.
//
//Please note that the task contains multiple classes (Car, Main). Car class is already implemented and you don't need to change it. Write your solution within the Main class.