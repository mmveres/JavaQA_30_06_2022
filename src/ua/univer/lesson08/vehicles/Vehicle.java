package ua.univer.lesson08.vehicles;

public abstract class Vehicle {
    private int speed;
    private String name;
    private int age;

    public Vehicle(int speed, String name, int age) {
        this.speed = speed;
        this.name = name;
        this.age = age;
    }
    public Vehicle(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void show();
    public abstract int move();
}
