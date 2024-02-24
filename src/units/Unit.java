package units;

import java.util.Random;

abstract public class Unit {
    String name;
    int health;
    String weapon;
    int powerHit;
    int speed;
    int armor;
    int atackRange;

    int hidding;
    int maxHealth;

    String className;



    public Unit (String name, int health, String weapon, int powerHit, int speed, int armor, int atackRange, int hidding){
        this.className = getClass().getSimpleName();
        this.name = name;
        this.health = this.maxHealth = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.atackRange = atackRange;
        this.hidding = hidding;
    }

    public void print(){
        System.out.println("class: " + className + " Name: " + name + " Hp: " + health);
    }

    public String getInfo(){
        return String.format("Name: %s, Health: %d, Speed: %d, Weapon: %s, Type: %s", name, health, speed,
                weapon, getClass().getSimpleName());
    }
}
