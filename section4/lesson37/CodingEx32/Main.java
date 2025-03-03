package section4.lesson37.CodingEx32;

public class Main {

    public static void main(String[] args) {
        // TODO: Create an array of Vehicle objects, populate it with instances of Car and Bicycle,
        //  and iterate over the array to call the move() method on each object
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();

        for (Vehicle i : vehicles) {
            i.move();
        }
        // Expected output:
        // The car drives
        // The bicycle pedals
    }
}

//Polymorphism in Java
//In this exercise, you will demonstrate polymorphism by creating a class hierarchy
//where subclasses override a method from their superclass. You will:
//
//Define a base class Vehicle with a method move().
//
//Define two subclasses Car and Bicycle that override the move() method to provide specific implementations.
//
//For the Car, the 'move' method should print "The car drives".
//
//For the Bicycle, the 'move' method should print "The bicycle pedals".
//
//WIthin the main method: Create an array of Vehicle objects, populate it with instances of Car and Bicycle,
//and iterate over the array to call the move() method on each object.
//
//Complete the move() method in the Car and Bicycle classes to print "The car drives" and "The bicycle pedals" respectively.