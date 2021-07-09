package com.company;

public class Player {
    private String name;
    private int hp;
    private int damage;
    private String skill;

    public Player(String name, int hp, int damage, String skill) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
