package units;

import java.util.ArrayList;

public class Sniper extends Unit{

    protected int countArrows;
    protected int accuracy;
    public Sniper(String name, int x, int y) {
        super(name, 150, "slingshot", 40, 3, 15, 50, 100, new Position(x, y));
        accuracy = 5;
        countArrows = 120;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if ((health <= 0) || (countArrows == 0)) return;
        Unit target = nearestEenemy(enemy);
        if (target == null) return;
        target.getHit(this.powerHit);
        countArrows--;
        System.out.println(printName() + " выстрелил в: " + target.name);

        for (Unit unit : friend) {
            if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                ((Peasant)unit).flag = true;
                return;
            }
        }
        countArrows--;
    }

    @Override
    public String toString() {
        return super.toString() + ", ➼: " + countArrows;
    }

    public String getInfo(){
        return "Снайпер";
    }

}
