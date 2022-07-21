package ua.univer.lesson07;

public abstract class Droid {
    private String name;
    private double energyLevel;
    private double damageLevel;

    public Droid(String name, double energyLevel, double damageLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.damageLevel = damageLevel;
    }
    public Droid(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    public double getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(double damageLevel) {
        this.damageLevel = damageLevel;
    }
    public abstract void show();
    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", energyLevel=" + energyLevel +
                ", damageLevel=" + damageLevel +
                '}';
    }
}
