package com.company;

public class Operatii {

    public static void main(String[] args) {
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(2,3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2,3));
        System.out.println("Rezultatul impartirii este: " + impartire(4,2));
    }

    private static int adunare(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    private static int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    private static int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    private static int impartire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }
}
