package ua.univer.lesson06;

public class Dog implements SwimAble, Comparable<Dog>{
    private int speed;

    @Override
    public int swim() {
        return speed;
    }

    public Dog() {
        this.speed = 10;
    }

    public Dog(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.getSpeed(), o.getSpeed());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                '}';
    }
}
