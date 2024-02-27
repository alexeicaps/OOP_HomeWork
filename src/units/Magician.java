package units;

public class Magician extends Unit{
    protected int mana;
    protected String magic;

    public Magician(String name, int x, int y) {
        super(name, 150, "magicStick", 20, 2, 10,50, 40, new Position(x, y));
        mana = 30;
        magic = "wizardDust";
    }

    @Override
    public String toString(){
        return name;
    }
}
