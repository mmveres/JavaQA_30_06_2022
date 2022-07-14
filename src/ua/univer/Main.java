package ua.univer;

public class Main {
    public static String taskIf(int age, boolean isDay) {
        if (age > 18 && isDay)
            return "i can by beer";
        else if (age < 18 || !isDay)
            return "i can by cola";
        else
           return "close";
    }

    public static void taskMonth(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                System.out.println();
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void main(String[] args) {
//        int x = 56;
//        long l = 3_000_000_000l;
//        int i = (int)1.2;
//        System.out.println(i);
        System.out.println(taskIf(34, true));
        System.out.println(taskIf(4, true));
        System.out.println(taskIf(4, false));
        taskMonth(1);
        taskMonth(10);
        taskMonth(1000);

    }


}

