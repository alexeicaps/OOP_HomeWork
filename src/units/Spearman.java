package units;

import java.util.ArrayList;

public class Spearman extends Unit{

    public Spearman(String name, int x, int y) {
        super(name, 150, "spear", 30, 2, 15, 50, 40, new Position(x, y));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0) return;
        Unit target = super.nearestEenemy(enemy);
        if (position.distance(target.position) < 2){
            target.getHit(powerHit);
            return;
        }
        Position diff = position.getDifference(target.position);
        if (Math.abs(diff.X) > Math.abs(diff.Y)){
            this.position.X += diff.X < 0 ? 1 : -1;
        } else {
            this.position.Y += diff.Y < 0 ? 1 : -1;
        }
    }
}
