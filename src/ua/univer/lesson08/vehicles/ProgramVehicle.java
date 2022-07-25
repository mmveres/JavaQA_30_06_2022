package ua.univer.lesson08.vehicles;

public class ProgramVehicle {

    public static void main(String[] args) {
        Flyer planeCargo = new AirPlaneCargo(1000, "Cargo", 10, 1000, 1000);
        Flyer planePass = new AirPlanePassenger(1200, "Cargo", 20, 2000, 100);

        Flyer.info(planeCargo);
        Flyer.info(planePass);

        Flyer[] flyers = {planeCargo, new Balloon()};

        for (Flyer f: flyers) {
            if (f instanceof AirPlaneCargo){
                AirPlaneCargo plane = (AirPlaneCargo) f;
                System.out.println(plane);
            }
        }
    }
}
