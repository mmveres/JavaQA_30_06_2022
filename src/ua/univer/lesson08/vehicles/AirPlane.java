package ua.univer.lesson08.vehicles;

public abstract class AirPlane extends Vehicle implements Flyer{
    private int height;

    public AirPlane(int speed, String name, int age, int height) {
        super(speed, name, age);
        this.height = height;
    }
}
