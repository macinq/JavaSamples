//Задание 151617
package com.bobrovsky.task151617;

import java.util.Arrays;
import java.util.Random;

class Person {
    protected String name;
    protected int health;
    protected int stamina;
    protected int armor;
    protected int damage;

    void Attack(Person pers) {
        System.out.println(getClass());
        GetDamage(pers);
    }

    void GetDamage(Person pers) {
        System.out.println(getClass());
        if (pers.armor > 0) {
            pers.armor -= damage;
            if (pers.armor < 0) {
                pers.armor = 0;
            }
        } else {
            pers.health -= damage;
            if (pers.health < 0) {
                pers.health = 0;
            }
        }
    }

    void Regen() {
    }

    void Shooting() {
    }

    void Prayer(int angelShield) {
    }

    void MagicShield(int magicArmor) {
    }

    void Healing() {
    }

    void Berserk() {
    }

    void BattleCry() {
    }
}

class Human extends Person {
    private int shot = 2;

    Human(String n, int h, int s, int a, int d) {
        name = n;
        health = h;
        stamina = s;
        armor = a;
        damage = d;
    }

    void Shooting() {
        System.out.println(getClass());
        if (stamina >= 50) {
            stamina -= 50;
            damage *= shot;
        }
    }

    void Prayer(int angelShield) {
        System.out.println(getClass());
        if (stamina >= 100) {
            stamina -= 100;
            armor += angelShield;
            while (health < 1000) {
                health += 50;
            }
        }
    }

    void Regen() {
        System.out.println(getClass());
        if (stamina >= 20) {
            stamina -= 20;
            for (int i = 0; i < 3; i++) {
                stamina += 20;
            }
        }
    }
}

class Elf extends Person{
    private int magic = 300;

    Elf(String n, int h, int s, int a, int d) {
        name = n;
        health = h;
        stamina = s;
        armor = a;
        damage = d;
    }

    void MagicShield(int magicArmor) {
        System.out.println(getClass());
        if (stamina >= 200) {
            stamina -= 200;
            armor += magicArmor;
        }
    }

    void Healing() {
        System.out.println(getClass());
        if (stamina >= 100) {
            stamina -= 100;
            magic = damage;
            while (health < 1500) {
                health += 100;
            }
            magic = 300;
        }
    }

    void Regen() {
        System.out.println(getClass());
        if (stamina >= 50) {
            stamina -= 50;
            for (int i = 0; i < 3; i++) {
                stamina += 50;
            }
        }
    }
}

class Ork extends Person {
    private int berserk = 240;

    Ork(String n, int h, int s, int a, int d) {
        name = n;
        health = h;
        stamina = s;
        armor = a;
        damage = d;
    }

    void Berserk() {
        System.out.println(getClass());
        if (stamina >= 210) {
            stamina -= 210;
            damage += berserk;
            armor -= 400;
        }
    }

    void BattleCry() {
        System.out.println(getClass());
        if (stamina >= 100) {
            stamina -= 100;
            health += 200;
        }
    }

    void Regen() {
        System.out.println(getClass());
        if (stamina >= 30) {
            stamina -= 30;
            for (int i = 0; i < 3; i++) {
                stamina += 30;
            }
        }
    }
}

public class SomeClasses {
    public static void main(String[] args) {
        Random random = new Random();
        Person[] pers = new Person[5];
        String[] orkNames = {"Navgal", "Grok", "Saar"};
        String[] elfNames = {"Eltel", "Druil", "Tesit"};
        String[] humNames = {"Vanya", "Johnny", "Ioann"};

        for (int i = 0; i < pers.length; i++) {
            int num = random.nextInt(3);
            int health = random.nextInt(2000) + 1;
            int stamina = random.nextInt(1000) + 1;
            int armor = random.nextInt(1000) + 1;
            int damage = random.nextInt(200) + 1;
            if (num == 0) {
                pers[i] = new Ork(orkNames[num], health, stamina, armor, damage);
            } else if (num == 1) {
                pers[i] = new Elf(elfNames[num], health, stamina, armor, damage);
            } else if (num == 2) {
                pers[i] = new Human(humNames[num], health, stamina, armor, damage);
            }
        }

        System.out.println("test:");
        System.out.println(pers[0].name);
        System.out.println(pers[1].name);
        System.out.println(pers[2].name);
        System.out.println(pers[3].name);
        System.out.println(pers[4].name);
        System.out.println();

        for (int i = 0; i < pers.length; i++) {
            int num = random.nextInt(3);
            System.out.println(i);
            pers[i].Berserk();
            pers[i].MagicShield(200);
            pers[i].Shooting();
            System.out.println("--");

            if (i == num) {
                continue;
            } else {
                pers[i].Attack(pers[num]);
            }
            System.out.println("----");

            pers[i].BattleCry();
            pers[i].Healing();
            pers[i].Prayer(200);
            System.out.println("------");

            pers[num].Attack(pers[i]);
            System.out.println("--------");
        }

        System.out.println();
        System.out.println("Regen:");
        for (int i = 0; i < pers.length; i++) {
            pers[i].Regen();
            System.out.println();
        }

    }
}
