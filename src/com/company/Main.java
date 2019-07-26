package com.company;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Read read = new Read();
        read.readList();
        LogicalOp op = new LogicalOp();
        op.getIndexValue(new int[]{1,2,3,4,5,6,7,8,9}, 122);
        op.wait2();
        //teme vechi
        /*Calculator calculator;
        calculator = new Calculator();

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(2,3);

        System.out.println("Exercitiul 1");
        op.panaLa100(12);
        op.panaLa100(110);

        System.out.println("Exercitiul 2");
        op.panaLaMinus100(12);
        op.panaLaMinus100(-200);

        System.out.println("Exercitiul 3");
        op.deLaPanaLa(10, 29);
        op.deLaPanaLa(10, 5);

        System.out.println("Exercitiul 4");
        op.deLaPanaLaCrescator(10, 29);
        op.deLaPanaLaCrescator(10, 5);

        System.out.println("Exercitiul 5");
        op.numerePareDela1La100();

        System.out.println("Exercitiul 6");
        op.numereImPareDela1La100();

        System.out.println("Exercitiul 7");
        op.sumaPanaLa100(5);
        op.sumaPanaLa100(105);

        System.out.println("Exercitiul 8");
        op.sumaPanaLa100SiMedia(50);


        System.out.println("Exercitiul 9");
        op.afisezaTiparStelute();

        // start tema Java While Loop //
        op.afiseazaWhilePanaLa100(90);
        op.afiseazaWhilePanaLaMinus100(0);
        op.whileDeLaPanaLa(10, 20);
        op.whileDeLaPanaLaCrescator(20, 15);
        op.whileParePanaLa100();
        op.whileImparePanaLa100();
        op.whileSumaAndMedia();
        op.whileIntervalMediaDivizibil7(1, 100);
        op.fibonaci();
        op.CozaLozaWoza();
        // end tema Java While Loop //

        //start Tema - Java Arrays
        calculator.adunare(10, 12, 11);
        op.generateArray100();
        int [] intArr = new int[50];
        op.arrayPare100(intArr);

        int media = op.mediaArray(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println("Media este: "+ media);

        boolean exista = op.stringInclude(new String[]{"a","b", "test"}, "test");
        System.out.println("String exista: "+ exista);

        int index = op.indexOf(new int[]{10,12,23,44,12,13}, 44);
        System.out.println("Indexul este: "+ index);

        op.printTablou();

        int[] arr = op.exclude(new int[]{10,11,22,23,44}, 22);
        System.out.print(Arrays.toString(arr));
        System.out.println("\n");

        int mic = op.alDoileaCelMaiMic(new int[]{1,22,3,4,5,6,7});
        System.out.print(mic);
        System.out.println("\n");

        int[] arr1 = op.copy(new int[]{1,2,3,4}, new int[]{});
        System.out.print(Arrays.toString(arr1));
        System.out.println("\n");*/
        //end Tema - Java Arrays
        //tema vechi
       /*
        System.out.println("The bigger number is: " + biggest);
        String stringCompare = op.isStringFastTrackIT("FastTrackIT");
        System.out.println(stringCompare);

        String stringAndIntCompare = op.isStringFastTrackITAnNumber("FastTrackIT", 2);
        System.out.println(stringAndIntCompare);

        String forecast = op.forecast(9);
        System.out.println(forecast);

        String intCompare = op.intCompare(12);
        System.out.println(intCompare);

        String numberIs = op.careENumarul(3);
        System.out.println(numberIs);

        System.out.println(op.isNumberEven(12));
        System.out.println(op.isEligibleToVote(17));
        System.out.println(op.greatherNumberOfThree(17,33,24));
        */


    }
}
