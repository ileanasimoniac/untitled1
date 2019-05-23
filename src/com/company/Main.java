package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("a=");
        int a = new Scanner(System.in).nextInt();
        System.out.println("b=");
        int b = new Scanner(System.in).nextInt();

        Main.careEsteMaiMare(a, b);
        Main.careEsteMaiMic(a, b);
    }

    private static void careEsteMaiMic(int a, int b) {
        if (a < b) {
            System.out.println("a este mai mic decat b");
        } else if(b < a) {
            System.out.println("b este mai mic decat a");
        }
    }

    private static void careEsteMaiMare(int a, int b) {
        if  (a>b) {
            System.out.println("a  este mai mare  decat b");
        } else if (b>a) {
            System.out.println("b  este mai mare  decat a");

        }

    }
}
