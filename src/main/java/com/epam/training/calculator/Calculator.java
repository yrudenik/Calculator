package com.epam.training.calculator;

public class Calculator {

    public int add(int first, int second) {
        return first + second;

    }

    public int multiply(int first, int second) {
        return first * second;
    }


    public int divide(int first, int second) {
        if (second == 0){
            throw new ArithmeticException("Division on 0");
        }
        return first / second;

    }

    public int deduct(int first, int second) {
        return first - second;
    }
}
