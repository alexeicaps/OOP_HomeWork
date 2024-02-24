package units;

public class Bandit extends Unit{
    protected int theft;
    public Bandit(String name) {
        super(name, 150, "baton", 30, 6, 15, 50, 80);
        theft = 10;
    }

    @Override
    public String toString() {
        return name;
    }
}
