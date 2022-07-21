package ua.univer.lesson07;

public class Program {
    public static void main(String[] args) {
     //   Droid d1   = new Droid("D", 50, 70);
        Droid r2d2 = new DroidRepair("R2D2", 70, 80,50);
        Droid db1  = new DroidBattle("DB1", 65, 75,30);
        Droid dbs1 = new DroidBattleSuper("DBS1", 85, 75,40);

        Droid [] droids1 = { r2d2, db1, dbs1};

        DroidService droidService = new DroidService(droids1);

        droidService.printDroids();
        System.out.println(droidService.getDroidMaxEnergyLevel());

        Droid [] droids2 = { db1, dbs1};
        DroidService droidService2 = new DroidService(droids2);
        droidService2.printDroids();
        System.out.println(droidService2.getDroidMaxEnergyLevel());

        boolean isDroidServiceLevelBigger =
                droidService.getDroidMaxEnergyLevel().getEnergyLevel() >
                        droidService2.getDroidMaxEnergyLevel().getEnergyLevel();

       if (db1 instanceof DroidBattle){
       DroidBattle db2 = (DroidBattle)db1;
       db2.shoot();
      //     ((DroidBattle)db1).shoot();
       }
    }


}
