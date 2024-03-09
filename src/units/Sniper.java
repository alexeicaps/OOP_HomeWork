package units;

import java.util.ArrayList;

public class Sniper extends Unit{

    protected int countArrows;
    protected int accuracy;
    public Sniper(String name, int x, int y) {
        super(name, 150, "slingshot", 40, 3, 15, 50, 100, new Position(x, y));
        accuracy = 5;
        countArrows = 200;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if ((health <= 0) || (countArrows == 0)) return;
        Unit target = nearestEenemy(enemy);
        target.getHit(this.powerHit);
        countArrows--;
    }

    @Override
    public String toString() {
        return super.toString() + ", \u27b6: " + countArrows;
    }

    public String getInfo(){
        return "Снайпер";
    }

}
