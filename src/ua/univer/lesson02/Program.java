package ua.univer.lesson02;

import ua.univer.tasks.ConditionStatements;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
//        while(true){
//            printMenu();
//            if(menu()==false) break;
//        }

        while(menu());
    }

    private static void printMenu() {
        System.out.println("--------------MENU---------------");
        System.out.println("1. printValue");
        System.out.println("2. printDecrement(200, 10)");
        System.out.println("3. getSum(0, 100)");
        System.out.println("4. task1");
        System.out.println("5. mark");
        System.out.println("0. exit");
    }

    private static boolean menu() {
        printMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 0: return false;
            case 1:{
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                System.out.println("enter delta");
                int delta = sc.nextInt();
                MyLibrary.print(start, stop, delta);
                return true;
            }
            case 2:{
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                MyLibrary.printDecrement(start, stop);
                return true;
            }
            case 3: {
                System.out.println("enter start");
                int start = sc.nextInt();
                System.out.println("enter stop");
                int stop = sc.nextInt();
                int sum = MyLibrary.getSum(start, stop);
                System.out.println(sum);
                return true;
            }
            case 4:
                System.out.println("enter n");
                int n = sc.nextInt();
                System.out.println(ConditionStatements.task1(n));
            case 5:
                int mark = 0;
                do{
                    System.out.println("enter mark");
                    mark = sc.nextInt();
                }while(mark<0 || mark>12);
                System.out.println(" your mark= "+ mark);
            case 6:
                for(int i = 0; i<100; i++){
                    System.out.println(i);
                }
            default:
                System.out.println("error");
                return false;
        }

    }

}
