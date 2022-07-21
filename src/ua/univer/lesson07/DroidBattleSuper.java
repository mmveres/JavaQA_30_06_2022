package ua.univer.lesson07;

public class DroidBattleSuper extends DroidBattle{
    private int countRocket;
    public DroidBattleSuper(String name, double energyLevel, double damageLevel, double shootLevel, int countRocket) {
        super(name, energyLevel, damageLevel, shootLevel);
        this.countRocket = countRocket;
    }
    public DroidBattleSuper(String name, double energyLevel, double damageLevel, double shootLevel) {
        this(name, energyLevel, damageLevel, shootLevel, 4);
    }
    public double shootRocket(){
        if (countRocket>0){
            countRocket--;
            return shoot()*2;
        }
        else
            return 0;
    }
}
