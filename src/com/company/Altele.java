package com.company;

public class Altele {

    public static void main(String[] args) {
        printJava();
        System.out.println("Media numarelor 10, 20, 30 este: " + media(10,20,30));
        printFunnyFace();
        System.out.println("Restul impartiri lui 10 la 3 este: " + rest(10,3));
        System.out.println("100 grade F in C sunt: " + FahrenheitToCelsius(100));
        System.out.println("100 de inch in metri rezulta: " + inchToMeter(100));
        vitezometru(1000, 0,0, 10);
    }

    public static void printJava() {
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a a");
        System.out.println("J  J  aaaaa   v v   aaaaa");
        System.out.println(" JJ  a     a   v   a     a");
    }

    public static double media(int numar1, int numar2, int numar3) {
        return (numar1 + numar2 + numar3) / 3;
    }

    public static void printFunnyFace() {
        System.out.println("  + \" \" \" \" \" +  ");
        System.out.println("[ |   o   o   | ]");
        System.out.println("  |     ^     |");
        System.out.println("  |   ' - '   |");
        System.out.println("  + - - - - - +  ");
    }

    public static int rest(int numar1, int numar2) {
        return numar1%numar2;
    }

    public static double FahrenheitToCelsius(int temp) {
        return (double) 5/9 * (temp - 32) ;
    }

    public static double inchToMeter(int inch) {
        double INCH_TO_METER_CONVERSION_FACTOR = 39.370;
        return (double) inch/INCH_TO_METER_CONVERSION_FACTOR;
    }

    public static void vitezometru(int distanta, int ore, int minute, int secunde) {
        int totalSecunde = secunde + 60*minute + 60*60*ore;

        double vitezaMetriPeSecunda = distanta / totalSecunde;

        //https://www.formulaconversion.com/formulaconversioncalculator.php?convert=meterspersecond_to_kilometersperhour
        double vitezaKilometriPeOra = vitezaMetriPeSecunda * 3.6;

        //https://www.formulaconversion.com/formulaconversioncalculator.php?convert=kilometersperhour_to_milesperhour
        double vitezaMilePeOra = vitezaKilometriPeOra * 0.6213711923;

        System.out.println("Viteza in metri pe secunda pentru distanta " + distanta + " metri parcursa in " + ore + " ore " + minute + " minute " + secunde +
                " este: " + vitezaMetriPeSecunda + "m/s" );
        System.out.println("Viteza in km/h pentru distanta " + distanta + " metri parcursa in " + ore + " ore " + minute + " minute " + secunde +
                " este: " + vitezaKilometriPeOra + "km/h" );
        System.out.println("Viteza in m/h pentru distanta " + distanta + " metri parcursa in " + ore + " ore " + minute + " minute " + secunde +
                " este: " + vitezaMilePeOra + "m/h" );
    }
}
