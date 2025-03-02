package section4.lesson33.CodingEx28;

public interface Vehicle {

    // TODO: Define start method
    void start();
    // TODO: Define stop method
    void stop();
    // TODO: Define default honk method that prints "Honking..."
    default void honk() {
        System.out.println("Honking...");
    }
    // TODO: Define static displayType method that prints "Vehicle Type"
    static void displayType() {
        System.out.println("Vehicle Type");
    }
}
