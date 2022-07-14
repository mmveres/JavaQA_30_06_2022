package ua.univer.lesson04;


import ua.univer.lesson04.my.A;
import ua.univer.lesson04.you.B;

class My {
    int x;
    int y;
}

public class Program {
    public static void swapValue(int x, int y) {
        int t = x;
        x = y;
        y = t;
    }

    public static void swapWrap(Integer x, Integer y) {
        int t = x;
        x = y;
        y = t;
    }

    public static void swapRef(int[] arr) {
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
    }

    public static void swapObj(My my) {
        int t = my.x;
        my.x = my.y;
        my.y = t;
    }

    public static void swapVarArgs(int... arr) {

            if (arr == null || arr.length == 0) throw new IllegalArgumentException("no elem");
            for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }


    }

    public static void main(String[] args) {
        My my = new My();
        my.x = 1;
        my.y = 2;
        swapObj(my);
        Integer x = 1;
        Integer y = 2;
        swapWrap(x, y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int[] arr = {x, y};
        swapRef(arr);
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
    }
}
