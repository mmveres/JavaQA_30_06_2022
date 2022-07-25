package ua.univer.lesson08.vehicles;

public class AirPlanePassenger extends AirPlane {
    private int count;

    public AirPlanePassenger(int speed, String name, int age, int height, int count) {
        super(speed, name, age, height);
        this.count = count;
    }

    @Override
    public void show() {
        System.out.println("AirPlanePassenger");
    }

    @Override
    public int move() {
        return getSpeed()*(1-count/100);
    }

    @Override
    public int takeoff() {
        return (int) (move()*0.6);
    }

    @Override
    public int land() {
        return (int) (move()*0.4);
    }

    @Override
    public int fly() {
        return move();
    }
}
