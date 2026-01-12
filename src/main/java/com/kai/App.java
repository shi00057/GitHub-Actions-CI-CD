package com.kai;

public class App {
    public static void main(String[] args) {
        var calc = new Calculator();
        int a = 7;
        int b = 6;
        System.out.println("add=" + calc.add(a, b));
        System.out.println("multiply=" + calc.multiply(a, b));
    }
}