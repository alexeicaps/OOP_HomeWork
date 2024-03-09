package units;

import java.util.ArrayList;

public class Monk extends Unit {
    protected int healing;
    public Monk(String name, int x, int y) {
        super(name, 150, "null", 0, 1, 10, 50, 40, new Position(x, y));
        healing = 10;
    }

//    @Override
//    public String toString() {
//        return name;
//    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {

    }

    public String getInfo(){
        return "Монах";
    }
}
