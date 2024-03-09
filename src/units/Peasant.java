package units;

import java.util.ArrayList;

public class Peasant extends Unit{
    protected int countArrows;
    public Peasant(String name, int x, int y) {
        super(name, 150, "arrow", 0, 0, 10, 0, 40, new Position(x, y));
        countArrows = 0;
    }

//    @Override
//    public String toString() {
//        return name;
//    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
    }

    public String getInfo(){
        return "Фермер";
    }
}
