package units;

public class Monk extends Unit {
    protected int healing;
    public Monk(String name) {
        super(name, 150, "null", 0, 4, 10, 50, 40);
        healing = 10;
    }

    @Override
    public String toString() {
        return name;
    }
}
