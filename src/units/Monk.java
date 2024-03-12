package units;

import java.util.ArrayList;

public class Monk extends Unit {
    protected int mana;
    boolean flag;
    public Monk(String name, int x, int y) {
        super(name, 150, "null", 0, 1, 10, 50, 40, new Position(x, y));
        mana = 10;
        flag = false;
    }

    @Override
    public String toString() {
        return super.toString() + " Мана: " + mana;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (getHP() <= 0) return;
        ArrayList<Unit> sortList = new ArrayList<>(friend);
        ArrayList<Unit> deadList = new ArrayList<>();
        sortList.sort((o1, o2) -> o1.getHP() - o2.getHP());
        int countdead = 0;
        for (Unit unit : sortList) {
            if (unit.getHP() == 0) {
                deadList.add(unit);
                countdead++;
            }
        }
        if (deadList.size() > 3) {
            flag = true;
            System.out.println("Флаг установлен у " + name);
        }
        if (flag && mana == 10){
            deadList.sort((o1, o2) -> o2.speed - o1.speed);
            deadList.getFirst().health += maxHealth;
            mana = 0;
            System.out.println("Воскресил: " + deadList.getFirst().name);
            flag = false;
            return;

        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
            sortList.getFirst().health += 13;
            System.out.println("Добавилось HP у: " + sortList.getFirst().name);
            mana -= 2;
            System.out.println("Убавилась мана у :" + name);
    }


    public String getInfo(){
        return "Монах";
    }
}
