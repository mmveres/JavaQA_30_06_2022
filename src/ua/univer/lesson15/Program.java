package ua.univer.lesson15;

import ua.univer.lesson13.kmda.User;
import ua.univer.lesson13.kmda.UserControl;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Program {
    public static void printCalc(int x, int y, BiFunction<Integer, Integer, Integer> func){
        System.out.println(func.apply(x,y));
    }
    public static void main(String[] args) throws IOException {

        List<User> userList = UserControl.getUserListFromFile("salary0719.csv");
        System.out.println(userList);
        Collections.sort(userList, Comparator.comparing(User::getName).thenComparingDouble(User::getSalary));
        System.out.println(userList);
        userList.sort(Comparator.comparing(User::getName));
        System.out.println(userList);
        System.out.println(f(List.of("123","4", "6543")));
    }

    private static void exampleLambda() {
        BiFunction<Integer, Integer, Integer> calcSum = (x, y) -> x+y;
        System.out.println(calcSum.apply(5,6));
        BiFunction<Integer, Integer, Integer> calMulty = (x, y) -> x*y;
        System.out.println(calMulty.apply(2,3));
        calMulty = (x , y) -> x*y* calcSum.apply(x,y);
        System.out.println(calMulty.apply(2,3)* calcSum.apply(5,6));

        printCalc(10, 20, calcSum);
        printCalc(10, 20, (x,y)-> x/y);



    }
    public static List<Integer> f(List<String> stringList){
        return  stringList.stream()
                .map(str -> str.length() )
                .sorted()
                .collect(Collectors.toList());
    }
}
