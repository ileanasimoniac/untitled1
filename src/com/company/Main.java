package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator;
        calculator = new Calculator();

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(2,3);
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
    }
}
