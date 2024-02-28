package units;

public class Spearman extends Unit{
    protected int countSpears;
    public Spearman(String name, int x, int y) {
        super(name, 150, "spear", 30, 6, 15, 50, 40, new Position(x, y));
        countSpears = 10;
    }

    @Override
    public String toString() {
        return name;
    }
}
