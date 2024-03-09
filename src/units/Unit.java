package units;

import java.util.List;

abstract public class Unit implements MyInterface {
    protected String name;
    protected int health;
    protected String weapon;
    protected int powerHit;
    protected int speed;
    protected int armor;
    protected int attackRange;

    protected int hiding;
    protected int maxHealth;
    int x;
    int y;
    public Position position;
    protected String className;



    public Unit (String name, int health, String weapon, int powerHit, int speed, int armor, int attackRange, int hiding, Position position){
        this.className = getClass().getSimpleName();
        this.name = name;
        this.health = this.maxHealth = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.armor = armor;
        this.attackRange = attackRange;
        this.hiding = hiding;
        this.position = position;
    }

    //Метод вывода имени и координат
    public void printCoordinates(){
        System.out.println("Name: " + name + ", Position: " + position.getX() + ", " + position.getY());
    }

    //Метод вывода информации
    @Override
    public String toString() {
        return name + ", \u2661: " + health + ", \u2694: " + powerHit + ", \uD83D\uDEE1\uFE0F" + armor;
    }

    public String getInfo(){
        return " ";
    }

    public int getDamage(Unit unit1, Unit target){
        if (this.health - unit1.powerHit > 0) {
            this.health -= unit1.powerHit;
            return this.health;
        }
        else {
            return -1;
        }
    }

    // Метод нанесения урона
    public void getHit(int damage){
        health -= damage;
        if (health < 0) health = 0;
        if (health >= maxHealth) health = maxHealth;
    }

    public int healing(Monk monk, Unit unit){
        return unit.health += monk.healing;
    }

    public int magic(Magician magician, Unit unit){
        return unit.health -= magician.mana;
    }

    public int getHP() {
        return health;
    }

    //
    public Unit nearestEenemy(List<Unit> targets){
        if (targets.isEmpty()){
            return null;
        }
        Unit nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Unit hero : targets) {
            double distance = position.distance(hero.position);
            if (distance < minDistance && hero.health > 0){
                minDistance = distance;
                nearest = hero;
            }
        }
        return nearest;
    }


    public int getSpeed() {
        return speed;
    }

    public int getHp(){
        return health;
    }
}
