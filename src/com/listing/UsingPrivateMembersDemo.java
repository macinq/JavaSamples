package com.listing;

class PrivateMembersDemo {
    private static int count = 0;
    private int number;
    private String name;

    PrivateMembersDemo(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("Object with name " + name + " has been created");
    }

    public void show() {
        System.out.println("Object name: " + name);
        System.out.println("Object number: " + number);
        System.out.println("Number of objects: " + count);
    }

    public void set(String n) {
        name = n;
    }
}

class UsingPrivateMembersDemo {
    public static void main(String[] args) {
        PrivateMembersDemo objA = new PrivateMembersDemo("Alpha");
        PrivateMembersDemo objB = new PrivateMembersDemo("Bravo");
        PrivateMembersDemo objC = new PrivateMembersDemo("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("Second object");
        objB.show();
    }
}
