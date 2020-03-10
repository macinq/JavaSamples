package com.listing;

class StaticMembersDemo {
    static int count = 0;

    StaticMembersDemo() {
        count++;
        System.out.println("Object number " + count + " has been created");
    }

    static void show() {
        System.out.println("Number of objects: " + count);
    }
}

class UsingStaticMembersDemo {
    public static void main(String[] args) {
        StaticMembersDemo.show();

        StaticMembersDemo objA = new StaticMembersDemo();
        StaticMembersDemo objB = new StaticMembersDemo();
        StaticMembersDemo objC = new StaticMembersDemo();

        StaticMembersDemo.show();
        objC.show();
        objB.show();
    }
}
