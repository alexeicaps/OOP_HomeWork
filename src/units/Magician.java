package units;

public class Magician extends Unit{
    private int mana;
    private String magic;

    public Magician(String name) {
        super(name, 150, "magicStick", 20, 2, 10,50, 40);
        mana = 200;
        magic = "wizardDust";
    }

    @Override
    public String toString(){
        return name;
    }
}
