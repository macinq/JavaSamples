package com.calculator.arithmetic;

public class Addition implements Action {
    public int invoke(int num1, int num2){
        return num1 + num2;
    }
}