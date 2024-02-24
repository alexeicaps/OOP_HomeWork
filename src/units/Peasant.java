package units;

public class Peasant extends Unit{
    protected int countArrows;
    public Peasant(String name) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40);
        countArrows = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
