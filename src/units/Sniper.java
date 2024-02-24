package units;

public class Sniper extends Unit{
    protected int accuracy;
    public Sniper(String name) {
        super(name, 150, "slingshot", 40, 2, 15, 50, 100);
        accuracy = 5;
    }

    @Override
    public String toString() {
        return name;
    }
}
