package units;

import java.util.ArrayList;

public class Sniper extends Unit{

    protected int countArrows;
    protected int accuracy;
    public Sniper(String name, int x, int y) {
        super(name, 150, "slingshot", 40, 2, 15, 50, 100, new Position(x, y));
        accuracy = 5;
        countArrows = 20;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void step(ArrayList<Unit> enemy) {

    }
}
