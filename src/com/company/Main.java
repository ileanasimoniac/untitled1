package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator;
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
