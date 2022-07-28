package ua.univer.lesson09;

import java.util.Arrays;
import java.util.List;

public class GenericProgram {
    public static void printList(List<?> list) {
        for (var elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1,2,3,4);
        printList(listInt);
    }
}
