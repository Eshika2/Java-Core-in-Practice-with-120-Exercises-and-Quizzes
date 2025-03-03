package section4.lesson40.example5.before;

public class Car {

    private RegularEngine regularEngine;

    public Car(RegularEngine regularEngine) {
        this.regularEngine = regularEngine;
    }

    public void startEngine() {
        regularEngine.start();
    }
}
