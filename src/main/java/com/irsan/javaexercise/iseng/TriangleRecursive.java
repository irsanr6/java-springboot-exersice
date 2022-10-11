package com.irsan.javaexercise.iseng;

public class TriangleRecursive {
//    public int triangle(int n) {
//        int total = 0;
//        while (n > 0) {
//            total = total + n;
//            --n;
//        }
//        return total;
//    }

    int triangle(int n) {
        if (n == 1)
            return 1;
        else
            return (n + triangle(n - 1));
    }

    public static void main(String[] args) {
        TriangleRecursive x = new TriangleRecursive();
        int data = x.triangle(100);
        System.out.println("Data " + data);
    }
}
