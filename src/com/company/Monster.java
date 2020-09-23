package com.company;

public class Monster {
    private String name;
    private int health;


    public Monster(String theirName, int theirHealth) {
        name = theirName;
        health = theirHealth;
    }

    public void damageHealth(int damageDone) {

    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String tauntHero(String heroName) { //Complete the method so it will say something using the hero's name.
        return null;
    }

    public int attackMonster() { //Should do 0-3 points of damage
        return 0;
    }
}
