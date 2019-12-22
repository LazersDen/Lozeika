import java.util.Scanner;

public class loplin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = 0;
        int t = 1000;
        for (int q = 1; 5 > q; q++) {
            System.out.println("Ведите число № " + q);
            int w = in.nextInt();
            if (w > r) {
                r = w;
            }
            if (w < t) {
                t = w;
            }
            System.out.println("Наибольшее число " + r);
            System.out.println("Наименшее число " + t);
        }
    }
}
