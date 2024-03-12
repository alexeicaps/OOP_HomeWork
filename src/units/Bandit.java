package units;

import java.util.ArrayList;

public class Bandit extends Unit{
    protected int theft;
    public Bandit(String name, int x, int y) {
        super(name, 150, "baton", 30, 2, 15, 50, 80, new Position(x, y));
        theft = 10;
    }

//    @Override
//    public String toString() {
//        return name;
//    }


    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0) return;
        Unit target = super.nearestEenemy(enemy);
        if (target == null) return;
        if (position.distance(target.position) < 2){
            target.getHit(powerHit);
            System.out.println(printName() + " ударил : " + target.name);
//            return;
        }
        Position diff = position.getDifference(target.position);
        Position newposition = new Position(position.X, position.Y);
        if (Math.abs(diff.X) > Math.abs(diff.Y))
            newposition.X += diff.X < 0 ? 1 : -1;
        else
            newposition.Y += diff.Y < 0 ? 1 : -1;

        for (Unit unit : friend) {
            if (unit.position.equals(newposition) && unit.health > 0) return;
        }
        this.position = newposition;
    }

    public String getInfo(){
        return "Разбойник";
    }
}
