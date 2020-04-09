package com.listing;

import javax.swing.*;

public class UsingIfDemo {
    public static void main(String[] args) {
        String input, txt, title;
        int number;
        ImageIcon img;

        input = JOptionPane.showInputDialog(null,
                "Enter an integer",
                "Checking the number",
                JOptionPane.QUESTION_MESSAGE
        );

        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "You haven't entered the number!",
                    "Input error",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

        number = Integer.parseInt(input);

        if (number % 2 == 0) {
            img = new ImageIcon("c:/JavaSamples/src/com/listing/even.png");
            txt = "The number " + number + " is even!";
            title = "Even number";
        }
        else {
            img = new ImageIcon("c:/JavaSamples/src/com/listing/odd.png");
            txt = "The number " + number + " is odd!";
            title = "Odd number";
        }

        JOptionPane.showMessageDialog(null,
                txt,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img
        );
    }
}
