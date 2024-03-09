import units.*;

import java.util.*;


public class Main {

    public static ArrayList<Unit> holyTeam = new ArrayList<>();
    public static ArrayList<Unit> darkTeam = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();
    public static void main(String[] args) {

        init();


//        System.out.println("Команда 1: ");
//        for (Unit unit : holyTeam){
//            unit.print();
//        }
//
//        System.out.println("Команда 2: ");
//        for (Unit unit : darkTeam){
//            unit.print();
//        }


        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {

                return o2.getSpeed() - o1.getSpeed();
            }
        });
//        allTeam.forEach(n -> System.out.println(n.getInfo()));
//        allTeam.forEach(n -> n.printCoordinates());
        System.out.println("*".repeat(100));

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            View.view();
            scanner.nextLine();
            int sumHolyTeamHP = 0;
            int sumDarkTeamHP = 0;
            for (Unit unit : holyTeam){
                sumHolyTeamHP += unit.getHp();
            }
            for (Unit unit : darkTeam){
                sumDarkTeamHP += unit.getHp();
            }
            if (sumHolyTeamHP == 0){
                System.out.println("holyTeam WON");
                flag = false;
                break;
            }
            if (sumDarkTeamHP == 0) {
                System.out.println("darkTeam WON");
                flag = false;
                break;
            }
            for (Unit unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
//            allTeam.forEach(n -> System.out.println(n.getInfo()));
//            allTeam.forEach(n -> n.printCoordinates());
        }
    }

    public static void init(){
        Random random = new Random();
        int teamCount = 10;
        for (int i = 1; i < teamCount + 1; i++) {
            switch (random.nextInt(7)) {
                case 0:
                    holyTeam.add(new Bandit(getNames(), i, 1));
                    break;
                case 1:
                    holyTeam.add(new Crossbowman(getNames(), i, 1));
                    break;
                case 2:
                    holyTeam.add(new Magician(getNames(), i, 1));
                    break;
                case 3:
                    holyTeam.add(new Monk(getNames(), i, 1));
                    break;
                case 4:
                    holyTeam.add(new Peasant(getNames(), i, 1));
                    break;
                case 5:
                    holyTeam.add(new Sniper(getNames(), i, 1));
                    break;
                case 6:
                    holyTeam.add(new Spearman(getNames(), i, 1));
                    break;
            }

            switch (random.nextInt(7)){
                case 0:
                    darkTeam.add(new Bandit(getNames(), i, 10));
                    break;
                case 1:
                    darkTeam.add(new Crossbowman(getNames(), i, 10));
                    break;
                case 2:
                    darkTeam.add(new Magician(getNames(), i, 10));
                    break;
                case 3:
                    darkTeam.add(new Monk(getNames(), i, 10));
                    break;
                case 4:
                    darkTeam.add(new Peasant(getNames(), i, 10));
                    break;
                case 5:
                    darkTeam.add(new Sniper(getNames(), i, 10));
                    break;
                case 6:
                    darkTeam.add(new Spearman(getNames(), i, 10));
                    break;
            }
        }
    }

    public static String getNames() {
        return String.valueOf((Names.values()[new Random().nextInt(Names.values().length - 1)]));
    }
}
