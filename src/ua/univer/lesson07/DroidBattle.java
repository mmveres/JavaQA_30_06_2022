package ua.univer.lesson07;

public class DroidBattle extends Droid{
    private double shootLevel;

    public DroidBattle(String name, double energyLevel, double damageLevel, double shootLevel) {
        super(name, energyLevel, damageLevel);
        this.shootLevel = shootLevel;
    }

    public double getShootLevel() {
        return shootLevel;
    }

    public void setShootLevel(double shootLevel) {
        this.shootLevel = shootLevel;
    }

    public double shoot(){
        return this.shootLevel*(this.getEnergyLevel()/100);
    }

    @Override
    public String toString() {
        return "DroidBattle{" +
                "shootLevel=" + shootLevel +
                "} " + super.toString();
    }
}
