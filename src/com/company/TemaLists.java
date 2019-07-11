package com.company;

import java.util.ArrayList;
import java.util.List;

public class TemaLists {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 1);
        l1.add(1, 2);
        printList(l1);

        List<Integer> l2 = appendToList(l1, 3);
        printList(l2);

        iterateListWithStartPoint(l2, 2);

        iterateListReversed(l2);

        List<String> ls = new ArrayList<>();
        ls.add(0,"string 1");
        ls = putStringAt(ls, "string 2", 1);
        ls = prependString(ls, "string 0");
        printListWithPos(ls);
        max(l1);
    }

    public static void printList(List<Integer> param) {
        param.forEach((e) -> {
            System.out.print(e);
            System.out.print("\n");
        });
    }

    public static List<Integer> appendToList(List<Integer> lista, int param) {
        lista.add(param);
        return lista;
    }

    public static void iterateListWithStartPoint(List<Integer> lista, int param) {
        lista.forEach((e) -> {
            if (e >= param) {
                System.out.print(e);
                System.out.print("\n");
            }
        });
    }

    public static void iterateListReversed(List<Integer> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i));
            System.out.print("\n");
        }
    }

    public static List<String> putStringAt(List<String> lista, String element, int pos) {
        lista.add(pos, element);
        return lista;
    }

    public static List<String> prependString(List<String> lista, String element) {
        lista.add(0, element);
        return lista;
    }

    public static void printListWithPos(List<String> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Pe pozitia " + i + " valoare este " + lista.get(i));
            System.out.print("\n");
        }
    }

    public static int max(List<Integer> lista) {
        int max = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        System.out.print("Max exte " + max);
        System.out.print("\n");
        return max;
    }
}
