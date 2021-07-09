package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Spartanes", 1000, 50, "Berserk");

        Magical magical = new Magical("Mag", 700, 60, "Fire ball");

        Mental mental = new Mental("Mentall", 600, 30, "Brain attack");

        Boss boss = new Boss("Madara" , 2000, 150, "Rinnengan");


        System.out.println("Имя " + boss.getName() + " \nЗдоровье: "  + boss.getHp() + "\n Урон: " + boss.getDamage() + " \nСпособность:" + boss.getSkill());
        System.out.println(" ");
        System.out.println("Имя " + warrior.getName() + " \nЗдоровье: "  + warrior.getHp() + "\n Урон: " + warrior.getDamage() + " \nСпособность:" + warrior.getSkill());
        System.out.println(" ");
        System.out.println("Имя " + magical.getName() + " \nЗдоровье: "  + magical.getHp() + "\n Урон: " + magical.getDamage() + " \nСпособность:" + magical.getSkill());
        System.out.println(" ");
        System.out.println("Имя " + mental.getName() + " \nЗдоровье: "  + mental.getHp() + "\n Урон: " + mental.getDamage() + " \nСпособность:" + mental.getSkill());
    }
}
