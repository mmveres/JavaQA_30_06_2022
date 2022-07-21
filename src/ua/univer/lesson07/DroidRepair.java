package ua.univer.lesson07;

public class DroidRepair extends Droid{
    private double fixLevel;

    public DroidRepair(String name, double energyLevel, double damageLevel, double fixLevel) {
        super(name, energyLevel, damageLevel);
        this.fixLevel = fixLevel;
    }

    public double getFixLevel() {
        return fixLevel;
    }

    public void setFixLevel(double fixLevel) {
        this.fixLevel = fixLevel;
    }

    @Override
    public void show() {
        System.out.println("DroidRepair");
    }

    @Override
    public String toString() {
        return "DroidRepair{" +
                "fixLevel=" + fixLevel +
                "} " + super.toString();
    }
}
