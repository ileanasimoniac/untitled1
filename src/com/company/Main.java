package com.company;

public class Main {

    public static void main(String[] args) {
        helloMyName();
        operatia1();
        operatia2();
        operatia3();
        operatia4();
        operatia5();
        operatia6();
    }

    private static void helloMyName() {
        System.out.println("Hello Ileana");
    }

    private static void operatia1() {
        System.out.println(10 + 21);
    }

    private static void operatia2() {
        System.out.println((double) 10 / 3);
    }

    private static void operatia3() {
        System.out.println(-5 + 8 * 6);
    }

    private static void operatia4() {
        System.out.println((55 + 9) % 9);
    }

    private static void operatia5() {
        System.out.println(20 + -3 * 5 / 8);
    }

    private static void operatia6() {
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}
