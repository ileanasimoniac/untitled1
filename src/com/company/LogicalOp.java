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

        }for (int i = numar; i >= 100; i--) {
            System.out.println(i);
        }
    }

    public void panaLaMinus100(int numar) {
        if (numar < 100) {
            for (int i = numar; i <= -100; i++) {
                System.out.println(i);
            }
        } else {

        }for (int i = numar; i >= -100; i--) {
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
        for(var i = 1; i<=100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void numereImPareDela1La100() {
        for(var i = 1; i<=100; i++) {
            if (i%2 == 1) {
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

        }for (int i = numar; i >= 100; i--) {
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

        }for (int i = numar; i >= 100; i--) {
            suma = suma + i;
            j = j +1;
        }

        System.out.println("Suma este: " + suma);
        System.out.println("Media este: " + suma/j);
    }

    public void afisezaTiparStelute() {
        for (var i = 1; i <= 7; i++) {
            String linie = "";
            for (var j = 8 - i ; j>= 1; j--) {
                linie = linie.concat("*");
            }
            System.out.println(linie);
        }
    }

}
