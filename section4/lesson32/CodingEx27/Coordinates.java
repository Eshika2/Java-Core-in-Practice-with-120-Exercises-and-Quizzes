package section4.lesson32.CodingEx27;

public class Coordinates {

    private int x;
    private int y;

    // Default constructor
    // TODO: Implement the default constructor to set x to 10 and y to 15
    public Coordinates() {
        this.x = 10;
        this.y = 15;
    }
    // Parameterized constructor
    // TODO: Implement the parameterized constructor to set x and y to the provided values
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Method to print the coordinates
    public void printInfo() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }

    // Getters for x and y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
//Implement a default constructor that sets x to 10 and y to 15.
//
//Also, implement a parameterized constructor that accepts two parameters and
//sets the instance variables x and y to these values.