/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_7;

/**
 *
 * @author german
 */
public class punto7a {

    // Búsqueda Binaria de forma recursiva
    public static boolean binario(int[] a, int n, boolean corte, int medio) {

        corte = a[medio] == n;
        if (!corte && medio != 0 && medio != a.length) {
            if (a[medio] > n) {
                medio = medio - 1;
                corte=binario(a, n, corte, medio);
            } else {
                medio = medio + 1;
                corte=binario(a, n, corte, medio);
            }
        }
        return corte;
    }

    public static void main(String[] args) {
        int n, medio;
        boolean corte = false;
        n = 2;
        int[] a = {1, 2, 3, 5, 7, 8, 9, 11};
        medio = a.length / 2;
        System.out.println(binario(a, n, corte, medio));
    }
}
