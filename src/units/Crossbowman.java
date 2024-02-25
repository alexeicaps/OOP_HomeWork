package units;

public class Crossbowman extends Unit {
    protected int countArrows;

    public Crossbowman(String name){
        super(name,150, "crossbow",20, 4, 15, 50,40);
        countArrows = 10;
    }

    @Override
    public String toString() {
        return name;
    }
}