package ua.univer.lesson08.vehicles;

public interface Flyer {
    int takeoff();
    int fly();

    static void info(Flyer flyer){
        System.out.println("Info");
        printInfo(flyer);
    }
    default int land(){
        return fly()/2;
    }
    private static void printInfo(Flyer flyer ){
        System.out.println(flyer.takeoff());
        System.out.println(flyer.land());
        System.out.println(flyer.fly());
    }
}
