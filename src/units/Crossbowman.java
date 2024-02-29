package units;

import java.util.ArrayList;

public class Crossbowman extends Unit {
    protected int countArrows;

    public Crossbowman(String name, int x, int y){
        super(name,150, "crossbow",20, 4, 15, 50,40, new Position(x, y));
        countArrows = 15;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void step(ArrayList<Unit> enemy) {
        if (health < 0 || countArrows == 0) return;

    }

    private boolean heroIsDead() {
        return true;
    }

    public int getArrows() {
        return countArrows;
    }
}
