package ua.univer.lesson08.vehicles;

public class Helicopter extends AirPlane implements ReFueling {
    public Helicopter(int speed, String name, int age, int height) {
        super(speed, name, age, height);
    }

    @Override
    public int takeoff() {
        return 0;
    }

    @Override
    public int fly() {
        return 0;
    }

    @Override
    public void show() {

    }

    @Override
    public int move() {
        return 0;
    }

    @Override
    public int refuel() {
        return 10;
    }
}
