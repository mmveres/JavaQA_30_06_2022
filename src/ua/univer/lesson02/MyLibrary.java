package ua.univer.lesson02;

public class MyLibrary {
    public static void task1(){
        System.out.println("hi from task1");
    }

    public static void task2(){
        System.out.println("hello from task2");
    }

    public static void print100(){
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i = i + 1;
        }

//        for(int i = 0;i < 100;i = i + 1){
//            System.out.println(i);
//        }
    }

    public static void print(int start, int stop, int delta){
        int i = start;
        while (i < stop) {
            System.out.println(i);
            i = i + delta;
        }
    }

    public static void printDecrement(int start, int stop){
        int i = start;
        while(i>=stop){
            System.out.println(i);
            i--;
        }
    }

    public static int getSum(int start, int stop) {
        int sum = 0;
        int value = start;
        while(value < stop){
            sum = sum+value;
            value++;
        }
        return sum;
    }
}
