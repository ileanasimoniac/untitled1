package com.company;

public class Calculator {

    public Calculator() {
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(2,3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2,3));
        System.out.println("Rezultatul impartirii este: " + impartire(4,2));
    }

    public int adunare(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public int adunare(int primulNumar, int alDoileaNumar, int alTreileaNumar) {
        int rezultat = primulNumar + alDoileaNumar + alTreileaNumar;
        return rezultat;
    }

    public float adunare(float primulNumar, float alDoileaNumar) {
        float rezultat = primulNumar + alDoileaNumar;
        return rezultat;
    }

    public float adunare(float primulNumar, float alDoileaNumar, float alTreileaNumar) {
        float rezultat = primulNumar + alDoileaNumar + alTreileaNumar;
        return rezultat;
    }

    public int scadere(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar - alDoileaNumar;
        return rezultat;
    }

    public int inmultire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar * alDoileaNumar;
        return rezultat;
    }

    public int impartire(int primulNumar, int alDoileaNumar) {
        int rezultat = primulNumar / alDoileaNumar;
        return rezultat;
    }
}
