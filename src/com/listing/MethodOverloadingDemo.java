package com.listing;

class OverloadingDemo {
    int number;
    char symbol;

    void set(int n) {
        number = n;
    }

    void set(char s) {
        symbol = s;
    }

    void set(int n, char s) {
        set(n);
        set(s);
    }

    void set() {
        set(0, 'Z');
    }

    void show() {
        System.out.println("Values " + number + " and " + symbol);
    }

    void show(String txt) {
        System.out.println(txt + ": values " + number + " and " + symbol);
    }

    void show(String txt1, String txt2) {
        System.out.println(txt1 + ": " + number);
        System.out.println(txt2 + ": " + symbol);
    }
}

class MethodOverloadingDemo {
    public static void main(String[] args) {
        OverloadingDemo objA, objB;

        objA = new OverloadingDemo();
        objB = new OverloadingDemo();

        objA.set(100);
        objA.set('A');

        System.out.println("Object objA:");
        objA.show();

        objB.set();

        objB.show("Object objB");

        objB.set(200, 'B');

        System.out.println("Object objB after change:");
        objB.show("Number", "Symbol");
    }
}
