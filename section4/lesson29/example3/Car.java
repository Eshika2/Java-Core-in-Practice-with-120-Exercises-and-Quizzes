package section4.lesson29.example3;

public class Car {

    int speed;
    int gear;

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    int getSpeed() {
        return speed;
    }
}
