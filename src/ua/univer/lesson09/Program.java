package ua.univer.lesson09;

import ua.univer.lesson06.Dog;
import ua.univer.lesson07.DroidBattle;
import ua.univer.lesson08.figures.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //test1();
        MyList<Dog> list = new MyList();
        list.add(new Dog(7));
        list.add(new Dog(5));
        list.add(new Dog(9));
//        list.add("hi");
        Dog[] dogs = list.toArray(new Dog[0]);
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        System.out.println(list.toString());

        MyList<String> list1 = new MyList();
        list1.add("b");
        list1.add("a");
//        list1.add(new Dog());
//        list1.add(new Dog());
        list1.add("hi");
        System.out.println(list1.toString());


        String[] strs = list1.toArray(new String[0]);
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
    }

    private static void test1() {
        Object obj = null;
        obj = new Point(1,2);
        obj = new DroidBattle("A",1,2,3);
        obj = new Dog();
        List<String> list = new ArrayList<>();
//        var list = new ArrayList<String>();
        list.add("0");
//        list.add(1.1);
        list.add("Hi");
//        list.add(true);
//        list.add(new Dog());
        for (var o: list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
