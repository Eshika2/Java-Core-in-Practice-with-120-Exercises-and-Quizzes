package section4.lesson33.CodingEx28;
// TODO: this class should implement the ElectricVehicle interface
public class Car implements ElectricVehicle{

    // TODO: Implement start method
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    // TODO: Implement stop method
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
    // TODO: Implement charge method
    @Override
    public void charge() {
        System.out.println("Car is charging");
    }
}
