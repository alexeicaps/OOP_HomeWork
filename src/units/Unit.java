package units;

abstract public class Unit {
    protected String name;
    protected int health;
    protected String weapon;
    protected int powerHit;
    protected int speed;
    protected int armor;
    protected int attackRange;

    protected int hiding;
    protected int maxHealth;

    String className;



    public Unit (String name, int health, String weapon, int powerHit, int speed, int armor, int attackRange, int hiding){
        this.className = getClass().getSimpleName();
        this.name = name;
        this.health = this.maxHealth = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.attackRange = attackRange;
        this.hiding = hiding;
    }

    public void print(){
        System.out.println("class: " + className + " Name: " + name + " Hp: " + health);
    }


//    public void getInfo(){
//        System.out.printf("Name: %s, Health: %d, Speed: %d, Weapon: %s, Type: %s", name, health, speed,
//                weapon, getClass().getSimpleName());
//    }
}
