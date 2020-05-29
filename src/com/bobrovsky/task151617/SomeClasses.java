//Задание 15,16,17
package com.bobrovsky.task151617;

class Person {
    String name;
    int health;
    int stamina;
    int armor;
    int damage;

    void Attack(Person pers) {
        GetDamage(pers);
    }

    void GetDamage(Person pers) {
        if (pers.armor > 0) {
            pers.armor -= damage;
        } else {
            pers.health -= damage;
        }
    }

    void Regen(Person)
}

class Human extends Person {
    private int shot = 2;

    void Shooting() {
        damage *= shot;
    }

    Human(String n, int h, int s, int a, int d) {
        name = n;
        health = h;
        stamina = s;
        armor = a;
        damage = d;
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
        stamina -= 200;
        armor += magicArmor;
    }

    void Healing() {
        stamina -= 100;
        magic = damage;
        while (health < 1500) {
            health += 100;
        }
        magic = 300;
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
        stamina -= 210;
        damage += berserk;
        armor -= 400;
    }

    void BattleCry() {
        stamina -= 100;
        health += 200;
    }
}

public class TwoClasses {
    public static void main(String[] args) {
        Person[] pers = new Person[3];
        Ork nagval = new Ork("Navgal", 2000, 520, 900, 187);
        Elf eltel = new Elf("Eltel", 1500, 1000, 505, 135);
        Human vanya = new Human("Vanya", 1000, 1000, 650, 100);
        pers[0] = nagval;
        pers[1] = eltel;
        pers[2] = vanya;

        nagval.Berserk();
        eltel.MagicShield(200);
        vanya.Shooting();

        System.out.println("Before:");
        System.out.println(nagval.health);
        System.out.println(nagval.armor);
        System.out.println(eltel.health);
        System.out.println(eltel.armor);
        System.out.println(vanya.health);
        System.out.println(vanya.armor);

//        nagval.Attack(eltel);
//        eltel.Attack(vanya);
//        vanya.Attack(nagval);

        System.out.println("After:");
        System.out.println(nagval.health);
        System.out.println(nagval.armor);
        System.out.println(eltel.health);
        System.out.println(eltel.armor);
        System.out.println(vanya.health);
        System.out.println(vanya.armor);
    }
}
