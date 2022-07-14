package ua.univer.lesson05;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 5, 4);
        Cat cat2 = new Cat("Barsik", 7, 6);
        cat1.eat(0.3);
        System.out.println(cat1);

        String str = "0123456789abcdef";
        for (int i = 0; i < str.length(); i++) {
            System.out.println((int)str.charAt(i));
        }

        String str1 = str.replace('3', '9');
        System.out.println(str1);
        int [] arr = {1,2,3,4};
        arr[2] = 999;
        System.out.println(Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            System.out.println(i);
            System.out.println(sb.length()+"/"+sb.capacity());
        }
        System.out.println(sb);

    }
}
