package ua.univer.lesson08.vehicles;

public class AirPlaneCargo extends AirPlane{
    private double weight;

    public AirPlaneCargo(int speed, String name, int age, int height, double weight) {
        super(speed, name, age, height);
        this.weight = weight;
    }

    @Override
    public void show() {
        System.out.println("AirPlaneCargo");
    }

    @Override
    public int move() {
        return (int) (getSpeed()*(weight/100));
    }

    @Override
    public int takeoff() {
        return (int) (move()*0.75);
    }

    @Override
    public int land() {
        return move()/2;
    }

    @Override
    public int fly() {
        return move();
    }
}
