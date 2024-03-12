package units;

import java.util.ArrayList;

public class Crossbowman extends Unit {
    protected int countArrows;

    public Crossbowman(String name, int x, int y) {
        super(name, 150, "crossbow", 20, 3, 15, 50, 40, new Position(x, y));
        countArrows = 12;

    }

    @Override
    public String toString() {
        return super.toString() + ", ➼: " + countArrows; //U+27BC
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if ((health <= 0) || (countArrows == 0)) return;
        Unit target = super.nearestEenemy(enemy);
        if (target == null) return;
        target.getHit(this.powerHit);
        countArrows--;

        for (Unit unit : friend) {
            if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                ((Peasant)unit).flag = true;
                return;
            }
        }
        countArrows--;


    }

//    private boolean heroIsDead() {
//        return true;
//    }

//    public int getArrows() {
//        return countArrows;
//    }


    public String getInfo(){
        return "Арбалетчик";
    }


}
