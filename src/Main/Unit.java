package Main;

import java.util.Random;

abstract public class Unit {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int speed;
    protected String weapon;
    protected int powerHit;
    protected int hidding;
    protected int armor;
    protected static Random random;

    static {
        Unit.random = new Random();
    }


    public Unit (String name, int health, int speed, String weapon, int powerHit, int hidding, int armor){
        this.name = name;
        this.health = this.maxHealth = health;
        this.speed = speed;
    }

    public String getInfo(){
        return String.format("Name: %s, Health: %d, Speed: %d, Weapon: %s, Type: %s", name, health, speed,
                weapon, getClass().getSimpleName());
    }
}
