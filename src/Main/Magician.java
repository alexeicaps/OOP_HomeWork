package Main;

public class Magician extends Unit{
    private int mana;
    private int maxMana;

    public Magician(String name, int health, int speed, String weapon, int powerHit, int hidding, int armor) {
        super(name, health, speed, weapon, powerHit, hidding, armor);
        this.maxMana = Magician.random.nextInt(23, 36);
        this.mana = maxMana;
    }
}
