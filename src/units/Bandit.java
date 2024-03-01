package units;

import java.util.ArrayList;

public class Bandit extends Unit{
    protected int theft;
    public Bandit(String name, int x, int y) {
        super(name, 150, "baton", 30, 6, 15, 50, 80, new Position(x, y));
        theft = 10;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {

    }
}
