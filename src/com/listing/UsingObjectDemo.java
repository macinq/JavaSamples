package com.listing;

import javax.swing.JOptionPane;

class ObjectDemo {
    int number;
    char symbol;
}

class UsingObjectDemo {
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();

        obj.number = 100;
        obj.symbol = 'A';

        String text = "Number: " + obj.number + "\n";
        text += "Symbol: " + obj.symbol;

        JOptionPane.showMessageDialog(null, text);
    }
}