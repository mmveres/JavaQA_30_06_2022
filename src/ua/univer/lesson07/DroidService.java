package ua.univer.lesson07;

public class DroidService {
    private Droid[] droids;
    public DroidService(Droid[] droids){
       this.droids = droids;
    }
    public Droid getDroidMaxEnergyLevel() {
        Droid droidMaxEnergyLevel = droids[0];
        for (Droid droid: droids) {
            if (droid.getEnergyLevel()> droidMaxEnergyLevel.getEnergyLevel())
                droidMaxEnergyLevel = droid;
        }
        return droidMaxEnergyLevel;
    }

    public void printDroids() {
        for (int i = 0; i < droids.length; i++) {
            System.out.println(droids[i]);
        }
    }
}
