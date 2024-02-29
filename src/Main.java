import units.*;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Unit> team1 = new ArrayList<>();
        ArrayList<Unit> team2 = new ArrayList<>();

        int teamCount = 10;
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(7)) {
                case 0:
                    team1.add(new Bandit(getNames(), i, 1));
                    break;
                case 1:
                    team1.add(new Crossbowman(getNames(), i, 1));
                    break;
                case 2:
                    team1.add(new Magician(getNames(), i, 1));
                    break;
                case 3:
                    team1.add(new Monk(getNames(), i, 1));
                    break;
                case 4:
                    team1.add(new Peasant(getNames(), i, 1));
                    break;
                case 5:
                    team1.add(new Sniper(getNames(), i, 1));
                    break;
                case 6:
                    team1.add(new Spearman(getNames(), i, 1));
                    break;
            }

////        for (int i = 0; i < 10; i++) {
////            int val = random.nextInt(7);

            switch (random.nextInt(7)){
                case 0:
                    team2.add(new Bandit(getNames(), i, 10));
                    break;
                case 1:
                    team2.add(new Crossbowman(getNames(), i, 10));
                    break;
                case 2:
                    team2.add(new Magician(getNames(), i, 10));
                    break;
                case 3:
                    team2.add(new Monk(getNames(), i, 10));
                    break;
                case 4:
                    team2.add(new Peasant(getNames(), i, 10));
                    break;
                case 5:
                    team2.add(new Sniper(getNames(), i, 10));
                    break;
                case 6:
                    team2.add(new Spearman(getNames(), i, 10));
                    break;
            }
        }
        System.out.println("Команда 1: ");
        for (Unit unit : team1){
            unit.printCoordinates();
        }

        System.out.println("Команда 2: ");
        for (Unit unit : team2){
            unit.printCoordinates();
        }
    }

    public static String getNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }



    // --------------------------Seminar 1 ------------------------------------------
//        Magician magician1 = new Magician("Ivan");
//        System.out.println(magician1);
//
//        Crossbowman crossbowman1 = new Crossbowman("John");
//        System.out.println(crossbowman1);
//
//        Monk monk1 = new Monk("Lilly");
//        System.out.println(monk1);
//
//        Bandit bandit1 = new Bandit("Harry");
//        System.out.println(bandit1);
//
//        Sniper sniper1 = new Sniper("Leon");
//        System.out.println(sniper1);
//
//        Peasant peasant1 = new Peasant("Bob");
//        System.out.println(peasant1);
//
//        Spearman spearman1 = new Spearman("Ron");
//        System.out.println(spearman1);

}
