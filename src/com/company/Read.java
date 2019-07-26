package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

    }

    public int readInt() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public float readFloat() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        return Float.parseFloat(reader.readLine());
    }

    public double readDouble() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }

    public List<Integer> readList() {
        List<Integer> lista = new ArrayList<Integer>();


        try {
            while(true) {
                Scanner in = new Scanner(System.in);
                lista.add(in.nextInt());
            }
        } catch (Exception e) {

        }

        return lista;
    }
}
