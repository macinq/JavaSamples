package com.listing;

class ConstructorDemo {
    int number;
    char symbol;

    ConstructorDemo() {
        number = 100;
        symbol = 'A';
    }

    ConstructorDemo(int n, char s) {
        number = n;
        symbol = s;
    }

    void show() {
        System.out.println("Values " + number + " and " + symbol);
    }
}

class UsingConstructorDemo {
    public static void main(String[] args) {
        ConstructorDemo objA = new ConstructorDemo();
        ConstructorDemo objB = new ConstructorDemo(200, 'B');
        System.out.println("Object objA:");
        objA.show();
        System.out.println("Object objB:");
        objB.show();
    }
}
