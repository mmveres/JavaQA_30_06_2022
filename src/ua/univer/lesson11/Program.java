package ua.univer.lesson11;

import java.util.*;

class Ship implements Comparable<Ship>{
    private String name;
    private int age;
    {

    }
    public Ship(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "hash = "+hashCode()+
                '}';
    }

    @Override
    public int compareTo(Ship o) {

        return name.compareTo(o.name);
    }
}
public class Program {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(10,"B");
        map.put(20,"C");
        map.put(26,"BB");
        map.put(17,"AA");
        System.out.println(map);
        System.out.println(map.get(10));

        Map<String, String> mapStr = new HashMap<>();
        mapStr.put("ab", "A");
        mapStr.put("ba", "B");
        mapStr.put("bac", "C");
        System.out.println(mapStr);

        Ship s1 = new Ship("A", 10);
        Ship s2 = new Ship("B", 20);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("eq = "+s1.equals(s2));
        System.out.println("addr = " + (s1==s2));

        Map<Ship,String> mapShips = new HashMap<>();
        mapShips.put(s1,"Odessa");
        System.out.println(mapShips.containsKey(new Ship("A", 10)));
        System.out.println(mapShips.get(new Ship("A", 10)));

        Set<Ship> shipSet = new TreeSet<>();
        shipSet.add(s1);
        shipSet.add(s2);
        System.out.println(shipSet);
    }

}
