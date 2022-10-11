package com.irsan.javaexercise.iseng;

public class SimpleRecursive {
    public static void main(String[] args) {
        int count = 5;
        simpleRec(count);
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    public static void simpleRec(int count) {
        System.out.println("Ini perulangan ke " + count);
        if (count <= 1) {
            return;
        }
        simpleRec(count - 1);
    }

    public static int factorial(int count) {
        if (count == 1) {
            return 1;
        } else {
            return (count + factorial(count - 1));
        }
    }
}
