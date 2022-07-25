package ua.univer.lesson08.vehicles;

public class Balloon implements Flyer{
    @Override
    public int takeoff() {
        return 10;
    }

    @Override
    public int land() {
        return 5;
    }

    @Override
    public int fly() {
        return 3;
    }
}
