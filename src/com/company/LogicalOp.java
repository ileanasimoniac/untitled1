package com.company;

public class LogicalOp {

    public LogicalOp() {

    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;

        } else {
            return second;
        }
    }

    public String isStringFastTrackIT(String parametru) {
        String FastTrackIT = "FastTrackIT";
        if (FastTrackIT.equals(parametru)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String isStringFastTrackITAnNumber(String parametruS, int parametruI) {
        String FastTrackIT = "FastTrackIT";
        if (FastTrackIT.contains(parametruS) && parametruI <= 3) {
            return parametruI + parametruS;
        } else {
            return parametruS + parametruI;
        }
    }

    public String forecast(int parametru) {
        if (parametru > 8 || parametru == 6) {
            return "The amount of snow this winter was(cm): " + parametru;
        } else {
            return "he forecast snow is(cm): " + parametru;
        }
    }

    public String intCompare(int parametru) {
        if (parametru > 3 && parametru != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (parametru == 4) {
            return "The number is equal to 4";
        } else if (parametru < 3) {
            return "The number is lower than 3”";
        } else {
            return "The number is equal to 3”";
        }
    }

    public String careENumarul(int numar) {
        switch (numar) {
            case 0:
                return "The number is: 0";
            case 1:
                return "The number is: 1";
            case 2:
                return "The number is: 2";
            case 3:
                return "The number is: 3";
            case 4:
                return "The number is: 4";
            case 5:
                return "The number is: 5";
            case 6:
                return "The number is: 6";
            case 7:
                return "The number is: 7";
            case 8:
                return "The number is: 8";
            case 9:
                return "The number is: 9";
            default:
                return "The number is: " + numar;
        }
    }

    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int number) {
        return number >= 18;
    }

    public int greatherNumberOfThree(int numar1, int numar2, int numar3) {
        if (numar1 > numar2 && numar1 > numar3) {
            return numar1;
        } else if (numar2 > numar1 && numar2 > numar3) {
            return numar2;
        } else {
            return numar3;
        }
    }

    public void panaLa100(int numar) {
        if (numar < 100) {
            for (int i = numar; i <= 100; i++) {
                System.out.println(i);
            }
        } else {

        }
        for (int i = numar; i >= 100; i--) {
            System.out.println(i);
        }
    }

    public void panaLaMinus100(int numar) {
        if (numar < 100) {
            for (int i = numar; i <= -100; i++) {
                System.out.println(i);
            }
        } else {

        }
        for (int i = numar; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void deLaPanaLa(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }
    }

    public void deLaPanaLaCrescator(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }

    public void numerePareDela1La100() {
        for (var i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void numereImPareDela1La100() {
        for (var i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void sumaPanaLa100(int numar) {
        int suma = 0;
        if (numar < 100) {
            for (int i = numar; i <= 100; i++) {
                suma = suma + i;
            }
        } else {

        }
        for (int i = numar; i >= 100; i--) {
            suma = suma + i;
        }

        System.out.println("Suma este: " + suma);
    }

    public void sumaPanaLa100SiMedia(int numar) {
        int suma = 0;
        int j = 0;
        if (numar < 100) {
            for (int i = numar; i <= 100; i++) {
                suma = suma + i;
                j = j + 1;
            }
        } else {

        }
        for (int i = numar; i >= 100; i--) {
            suma = suma + i;
            j = j + 1;
        }

        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + suma / j);
    }

    public void afisezaTiparStelute() {
        for (var i = 1; i <= 7; i++) {
            String linie = "";
            for (var j = 8 - i; j >= 1; j--) {
                linie = linie.concat("*");
            }
            System.out.println(linie);
        }
    }

    public void afiseazaWhilePanaLa100(int numar) {
        if (numar >= 100) {
            while (numar >= 100) {
                System.out.println(numar);
                numar--;
            }
        } else {
            while (numar <= 100) {
                System.out.println(numar);
                numar++;
            }
        }
    }

    public void afiseazaWhilePanaLaMinus100(int numar) {
        if (numar >= -100) {
            while (numar >= -100) {
                System.out.println(numar);
                numar--;
            }
        } else {
            while (numar <= -100) {
                System.out.println(numar);
                numar++;
            }
        }
    }

    public void whileDeLaPanaLa(int x, int y) {
        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (x >= y) {
                System.out.println(x);
                x--;
            }
        }
    }

    public void whileDeLaPanaLaCrescator(int x, int y) {
        if (x < y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        }
    }

    public void whileParePanaLa100() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void whileImparePanaLa100() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void whileSumaAndMedia() {
        int counter = 0;
        int x = 111;
        int y = 8899;
        int suma = 0;
        while (x <= y) {
            suma = suma + x;
            counter++;
            x++;
        }
        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + suma / counter);
    }

    public void whileIntervalMediaDivizibil7(int x, int y) {
        int counter = 0;
        int suma = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                suma = suma + x;
                counter++;
            }
            x++;
        }
        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + suma / counter);
    }


    public void fibonaci() {
        int i = 1;
        int n = 20;
        int t1 = 0;
        int t2 = 1;
        while (i <= n) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
    }

    public void CozaLozaWoza() {
        System.out.print("\n");
        boolean stegulet;
        int i = 1;
        while (i <= 110) {
            stegulet = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                stegulet = true;
            }
            if (i % 5 == 0) {
                System.out.print("Losa");
                stegulet = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                stegulet = true;
            }
            if (!stegulet) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    public void generateArray100() {
        int[] intArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            intArray[i - 1] = i;
            System.out.println("Element at index " + (i - 1) +
                    " : " + intArray[i - 1]);
        }
    }

    public int[] arrayPare100(int[] intArray) {
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                intArray[index] = i;
                System.out.println("Element at index " + index +
                        " : " + intArray[index]);
                index++;
            }
        }

        return intArray;
    }

    public int mediaArray(int[] intArr) {
        int suma = 0;
        for (int i = 0; i < intArr.length; i++) {
            suma = suma + intArr[i];
        }

        return suma / intArr.length;
    }

    public boolean stringInclude(String[] stringArr, String val) {

        for (String s : stringArr) {
            if (val.equals(s)) {
                return true;
            }
        }

        return false;
    }

    public int indexOf(int[] intArr, int val) {
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] == val) {
                return i;
            }
        }

        return -1;
    }

    public void printTablou() {
        String[][] tablou = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablou[i][j] = "- ";
            }
        }

        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10) {
                System.out.print(tablou[i][j]);
                j++;
            }
            System.out.print("\n");
        }
    }

    public int[] exclude(int[] intArr, int exclude) {
        int[] returnArr = intArr;
        int index = this.indexOf(intArr, exclude);
        if (index > -1) {
            returnArr = new int[intArr.length - 1];
            int j = 0;
            for(int i = 0; i < intArr.length; i++) {
                if (i != index) {
                    returnArr[j] = intArr[i];
                    j++;
                }
            }
        }
        return returnArr;
    }

    public int alDoileaCelMaiMic(int[] intArr) {
        int mic1 = 10000;
        int mic2 = 10000;

        for(int numar:intArr) {
            if (numar < mic1) {
                mic1 = numar;
            }
            if (numar > mic1 && numar < mic2) {
                mic2 = numar;
            }
        }
        return mic2;
    }

    public int[] copy(int[] source, int[] destination) {
        destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }
}
