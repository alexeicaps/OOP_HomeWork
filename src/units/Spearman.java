package units;

public class Spearman extends Unit{
    protected int countSpears;
    public Spearman(String name) {
        super(name, 150, "spear", 30, 6, 15, 50, 40);
        countSpears = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
