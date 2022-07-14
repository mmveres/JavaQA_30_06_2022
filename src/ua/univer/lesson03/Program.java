package ua.univer.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int x = 123;
        int count = 0;
        while (x>0) {
            count = count + x % 2;
            x/=2;
        }



    //    int [] arr = {1,2,3,4,6};
        int[] arr = new int[3];
        arr = fillArrFromConsoleNValue(arr);
      //  fillArrFromConsole(arr);
        Arrays.sort(arr);
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(findSum(arr));
        System.out.println(findAverage(arr));
        printArr(arr);
    }

    private static int findMin (int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }return min;
    }
    private static int findSum (int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }return sum;
    }
    private static double findAverage (int[] arr){
        return (double)findSum(arr)/ arr.length;
    }

    private static int findMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue< arr[i])
                maxValue = arr[i];
        }
        return maxValue;
    }

    private static int[] fillArrFromConsoleNValue(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter count of element");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (i == arr.length){
               // arr = growAndCopyArr(arr);
//
//                int[] temp = new int[arr.length*2];
//                System.arraycopy(arr,0,temp, 0,arr.length);
//                arr = temp;

                arr = Arrays.copyOf(arr, arr.length*2);
            }
            System.out.print("enter value of arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        return Arrays.copyOf(arr, count);
    }

    private static int[] growAndCopyArr(int[] arr) {
        int[] temp = new int[arr.length*2];
        for (int j = 0; j < arr.length; j++) {
            temp[j] = arr[j];
        }
        arr = temp;
        return arr;
    }

    private static void fillArrFromConsole(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter value of arr["+i+"] = ");
            arr[i] = sc.nextInt();

        }
    }

    private static void fillArrBySquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i;
        }
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]= "+arr[i]);
        }
    }
}
