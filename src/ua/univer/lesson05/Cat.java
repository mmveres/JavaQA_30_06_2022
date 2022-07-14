package ua.univer.lesson05;

public class Cat {
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight){
        this.name= name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name){
        this(name, 1, 3);
    }
    public Cat(int age){
        this("Anonim", age, 1);
    }

    public void eat(double food){
        this.weight+=food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
