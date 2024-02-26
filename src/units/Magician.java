package units;

public class Magician extends Unit{
    protected int mana;
    protected String magic;

    public Magician(String name) {
        super(name, 150, "magicStick", 20, 2, 10,50, 40);
        mana = 30;
        magic = "wizardDust";
    }

    @Override
    public String toString(){
        return name;
    }
}
